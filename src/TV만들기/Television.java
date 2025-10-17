package TV만들기;
// 전원 : ON/OFF
// 채널 : 1 ~ 999
// 볼륨 : 0 ~ 100
// 인스턴스 필드와 게터, 세터 메서드 구현
// 매개변수가 있는 생성자를 통해 기본값 대입
// TV 3대 만들기
// TV의 정보는 toString 메서드를 오버라이드 해서출력하기

public class Television {
    private Boolean power;
    private int channel;
    private int volume;

    public Boolean getPower() {
        return power;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 999) this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) this.volume = volume;
    }

    // 매개변수가 있는 생성자
    public Television(Boolean power, int channel, int volume) {
        this.power = power;
        this.channel = channel;
        this.volume = volume;
    }

    // 매개변수가 없는 생성자
    public Television() {
        this.power = false;
        this.channel = 30;
        this.volume = 30;
    }

    // 매개변수가 1개 있는 생성자
    public Television(boolean power) {
        this.power = power;
        this.channel = 30;
        this.volume = 30;
    }

    @Override
    public String toString() {
        return "=".repeat(7) + "TV 정보" + "=".repeat(7) +
                "\n전원 : " + ((power)?"켜짐":"꺼짐") +
                "\n채널 : " + channel +
                "\n볼륨 : " + volume;
    }
}
