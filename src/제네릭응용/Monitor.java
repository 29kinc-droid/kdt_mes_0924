package 제네릭응용;

public class Monitor extends Device{
    @Override
    public void turnOn() {
        System.out.println("모니터를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("모니터를 끕니다");
    }
}
