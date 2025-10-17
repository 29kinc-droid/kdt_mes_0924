package 정적멤버;
// static : 정적 멤버(필드) 및 메서드를 만들 때 사용, 클래스 생성 시 함께 생성되고 객체 생성 시 생성되지 않음
// 은행을 5개 만들고 각각에 대해서 입금, 출금, 조회 기능 구현하기
// Bank 클래스를 객에서 몇개 생성되었는지를 확인하기 위해서 정적 메서드 호출해서 결과 확인하기

public class StaticMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("카카오", 1000);
        Bank bank2 = new Bank("토스", 100);
        Bank bank3 = new Bank("국민", 200);
        Bank bank4 = new Bank("농협", 300);
        Bank bank5 = new Bank("신한", 400);

        bank1.viewAccount();
        bank2.viewAccount();
        bank3.viewAccount();
        bank4.viewAccount();
        bank5.viewAccount();

        bank1.setDeposit(23);
        bank2.setDeposit(6666);
        bank3.setDeposit(8494);
        bank4.setDeposit(1222);
        bank5.setDeposit(3333);

        bank1.viewAccount();
        bank2.viewAccount();
        bank3.viewAccount();
        bank4.viewAccount();
        bank5.viewAccount();

        bank1.setWithdraw(1241);
        bank2.setWithdraw(235);
        bank3.setWithdraw(2);
        bank4.setWithdraw(5444);
        bank5.setWithdraw(2222);

        bank1.viewAccount();
        bank2.viewAccount();
        bank3.viewAccount();
        bank4.viewAccount();
        bank5.viewAccount();

        // getCount()는 정적 메서드로 객체 이름이 아닌 클래스 이름으로 접근
        System.out.println("계좌의 수는 " + Bank.getCount() + "개 입니다.");
    }
}
