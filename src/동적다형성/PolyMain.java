package 동적다형성;
// 다형성 : 한 가지 인터페이스나 클래스를 여러 형태로 사용할 수 있는 능력을 말함
// 오버로딩 (정적 다형성) : 매개변수의 타입이나 갯수로 여러 형태의 메서드 사용
// 오버라이딩 (동적 다형성) : 부모 클래스의 메서드를 하위 클래스에서 재정의하여 사용하는 것을 의미

import 상속TV.ProductTV;

import java.util.Scanner;

public class PolyMain {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("[1]TV [2]Computer [3]Audio [4]정보 보기 [5]종료");
            System.out.print("구매할 제품 번호 선택 : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 : buyer.buy(new TV()); break;
                case 2 : buyer.buy(new Computer()); break;
                case 3 : buyer.buy(new Audio()); break;
                case 4 : buyer.viewInfo(); break;
                case 5 : System.out.println("구매 종료"); return;
                default: System.out.println("메뉴 선택이 잘못되었습니다.");
            }
        }
    }
}
