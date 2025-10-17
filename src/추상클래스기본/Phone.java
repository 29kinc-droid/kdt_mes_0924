package 추상클래스기본;

// abstract 키워드는 해당 클래스가 추상 클래스임을 선언함 => 객체생성 불가
public abstract class Phone {
    String name;
    boolean isPower;
    public Phone(String name) {
        this.name = name;
        isPower = false;
    }
    public void setPower(boolean power) {
        this.isPower = power;
        System.out.println("Phone power " + (power?"ON":"OFF"));
    }
    abstract void call();   // 구현부 없는 추상 메서드, 반드시 상속받은 클래스에서 오버라이드 해야함
    abstract void store();
}
