package 인터페이스리모콘;
// interface 키워드로 인터페이스 선언

public interface RemoteControl {
    int MAX_VOLUME = 100;   // public final static이 자동으로 추가되어 상수로 만들어짐,
                            // 설계명세에서 범위값 정보를 클래스에 전달하는 용도
    int MIN_VOLUME = 5;
    void turnOn();  // public abstract가 자동 추가, 왜냐면 기본적으로 인터페이스는 완전 추상화이기 때문
                    // 상속받은 클래스에서 반드시 오버라이딩 해야함
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if(mute) System.out.println("무음처리합니다");
    }

    static void changeBattery() {
        System.out.println("건전지를 교환합니다");
    }
}
