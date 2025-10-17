package 제네릭응용;

public class Printer extends Device{

    @Override
    public void turnOn() {
        System.out.println("프린터를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("프린터를 끕니다");
    }
}
