package 동적다형성실습;

public class Manager {
    public void send(Delivery d) {
        System.out.println(d.getCompany() + "회사가 배송을 진행합니다.");
        d.deliver();
    }
}
