package 제네릭응용;

public class KeyBoard extends Device{
    @Override
    public void turnOn() {
        System.out.println("키보드에 불이 들어옵니다");
    }

    @Override
    public void turnOff() {
        System.out.println("키보드의 작동이 멈춥니다");
    }
}
