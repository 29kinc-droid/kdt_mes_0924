package 상속TV;
// 시제품 TV 만들기
// 전원, 채널, 볼륨 기능을 가짐.
// 채널은 1 ~ 999
// 볼륨은 0 ~ 100
// 생성자는 만들지 않음

public class ProtoTypeTV {
    // 접근제한자 : public, protected, default(키워드 없음)
    protected boolean power;
    protected int volume;
    protected int channel;

    // 생성자를 생략하면 기본 생성자가 만들어짐

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 999) this.channel = channel;
    }
}
