package 추상클래스기본;
// 추상클래스란? 인스턴스를 만들 수 없는 클래스를 의미
// 역할 : 공통 기능을 묶어 제공하고, 자식 클래스가 반드시 구현해야 할 메서드를 강제함
// 목적 : 객체지향의 다형성을 지원하고 템플릿 구조를 만들기 위해 사용

public class AbstractMain {
    public static void main(String[] args) {
        Phone galaxy = new AndroidPhone("Galaxy S25");
        Phone iPhone = new IPhone("iPhone Pro 17");

        galaxy.setPower(true);
        galaxy.call();
        galaxy.store();

        iPhone.setPower(true);
        iPhone.call();
        iPhone.store();
    }
}
