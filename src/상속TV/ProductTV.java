package 상속TV;
// ProtoTypeTV를 상속받음
// 볼륨을 오버라이드해서 0 ~ 200까지 확장
// 채널도 오버라이드해서 1 ~ 1999까지 확장 (setChannel())
// 매개변수가 있는 생성자와 없는 생성자 만들기
// 채널을 오버로딩해서 setChannel(boolean internet, int channel) 기능 확장
// - internet 기능이 켜지면 채널 설정 정보는 무시하고 인터넷 티비로 동작
// 결과 출력은 toString() 메서드를 오버라이딩해서 구현


public class ProductTV extends ProtoTypeTV{
    protected boolean internet;

    @Override   // 문법적으로 오버라이드 관계가 성립하는지 체크해줌
    // 오버라이드 : 부모가 가진 메서드를 재정의함 (자식이 재정의하는 경우 자식 메서드가 호출됨)
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 200) this.volume = volume;
    }

    @Override
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 1999) this.channel = channel;
    }

    public ProductTV() {
        power = false;
        volume = 50;
        channel = 1999;
    }

    public ProductTV(boolean power, int volume, int channel) {
        this.power = power;
        this.volume = volume;
        this.channel = channel;
    }

    public void setChannel(boolean internet, int channel) {
        this.internet = internet;
        if (this.internet) System.out.println("인터넷 TV로 전환합니다");
        else {
            System.out.println("일반 TV로 전환합니다");
            if (channel >= 1 && channel <= 1999) this.channel = channel;
        }
    }
    // 메서드 오버로딩 : 메서드 이름이 동일하고, 메서드 매개변수의 갯수 또는 타입으로 메서드를 구분해서 호출하는 것 (정적 바인딩)

    @Override
    public String toString() {
        return "=".repeat(7) + "TV정보" + "=".repeat(7) +
                "\n 전원 : " + (power?"켜짐":"꺼짐") +
                "\n 볼륨 : " + volume +
                "\n 채널 : " + channel +
                "\n 인터넷TV : " + (internet?"인터넷TV":"일반TV");
    }
}
