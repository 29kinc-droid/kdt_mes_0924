package Super실습문제;
//- 인스턴스 필드: speed, color, name
//- 생성자 오버로딩:
//  - Car() : 기본 speed = 100, color = "White", name = "BasicCar"
//  - car(int speed, String color) : speed와 color 지정, name = "CustomCar"
//- displayInfo() 메서드: 자동차 정보를 출력

public class Car {
    protected int speed;
    protected String color;
    protected String name;

    public Car() {
        this.speed = 100;
        this.color = "White";
        this.name = "BasicCar";
    }

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
        this.name = "CustomCar";
    }

    public void DisplayInfo() {
        System.out.println("=".repeat(7) + "자동차 정보" + "=".repeat(7));
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("이름 : " + name);
    }
}
