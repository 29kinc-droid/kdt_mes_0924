package 영화표예매하기;

// 메뉴 : [1] 예매하기 [2] 취소하기 [3] 종료하기

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        // TODO : 좌석당 가격을 생성자로 전달해서 객체 생성
        MovieTicket movieTicket = new MovieTicket(10000);
        // TODO : 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        int input = -1;
        // TODO : while 반복문 생성 ([1] 예매하기 [2] 취소하기 [3] 종료하기)
        while (true) {
            System.out.println("[1] 예매하기 [2] 취소하기 [3] 종료하기");
            try {
                input = sc.nextInt();
            } catch (Exception e) {
                System.out.println("'" + sc.next() + "'는 유효한 입력이 아닙니다.");
                continue;
            }
            switch (input) {
                case 1 : movieTicket.reserveSeat(); break;
                case 2 : movieTicket.cancelSeat(); break;
                case 3 : System.out.println("총 매출액은 " + movieTicket.totalAmount() + "원 입니다."); return;
                default : System.out.println("메뉴 중에서 하나를 선택해주세요");
            }
        }
    }
}
