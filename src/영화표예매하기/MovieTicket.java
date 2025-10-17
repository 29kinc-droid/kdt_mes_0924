package 영화표예매하기;


import java.util.Scanner;

public class MovieTicket {
    // TODO : 좌석 10개에 대한 배열 생성
    private final boolean[] seats;

    // TODO : 좌석당 가격을 받기 위한 인스턴스 필드 생성, 외부에서 생성자를 통해서 주입받은 값이 변경되는 걸 막기 위해  final사용
    private final int price;

    // TODO : 입력용 스캐너 생성, 대입 받는 스캐너의 주소를 고정하기 위해서 final 사용
    private final Scanner sc;

    // TODO : 생성자를 만들고 가격을 주입받음
    public MovieTicket(int price) {
        this.seats = new boolean[10];   // heap 영역에 배열을 할당하면 자동 초기화 됨 (자바)
        this.sc = new Scanner(System.in);
        this.price = price;
    }

    // TODO : 좌석 상태를 출력하는 메서드 생성 : 배열의 값이 0이면 [ ], 1이면 [V]
    public void printSeats() {
        for (boolean e : seats)     // 향상된 for문으로 이터러블 객체를 자동 순회, e변수는 배열의 실제 값이 복사됨
            System.out.print(e?"[V]":"[ ]");
        System.out.println();
    }

    // TODO: 좌석 번호 유효성 체크, 반환값이 boolean이기 때문에 true, false 값을 반환함
    private boolean isValidPos(int seatPos) { return seatPos >= 1 && seatPos <= seats.length;}

    // TODO : 좌석 예매 메서드 (먼저 좌석 상태를 보여주고, 예매 기능을 처리하고, 변경된 좌석 상태를 보여줌)
    public void reserveSeat() {
        printSeats();
        System.out.println("예약할 좌석을 선택해주세요 (1 ~ 10) : ");
        int input = sc.nextInt();
        if (!isValidPos(input)){
            System.out.println("입력값이 잘못되었습니다");
            return;
        }
        if(!seats[input-1]) seats[input-1] = true;
        else System.out.println("이미 예매되어 있는 좌석입니다.");
        printSeats();
    }

    // TODO : 좌석 취소 메서드 (먼저 좌석 상태를 보여주고, 취소 기능을 처리하고, 변경된 좌석 상태를 보여줌)
    public void cancelSeat() {
        printSeats();
        System.out.println("취소할 좌석을 선택해주세요 (1 ~ 10) : ");
        int input = sc.nextInt();
        if (!isValidPos(input)){
            System.out.println("입력값이 잘못되었습니다");
            return;
        }
        if(seats[input-1]) seats[input-1] = false;
        else System.out.println("예매되지 않은 좌석입니다.");
        printSeats();
    }

    // TODO : 종료하기 선택 시 총 매출액 보여주기
    public int totalAmount() {
        int cnt = 0;
        for (boolean e : seats)
            if (e) cnt++;
        return cnt * price;
    }
}
