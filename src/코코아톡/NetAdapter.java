package 코코아톡;

public interface NetAdapter {
    void connect();
    void send(String msg);
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi에 연결되었씁니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " + msg);
    }
}

class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> " + msg);
    }
}

class Lte implements NetAdapter {
    @Override
    public void connect() {
        System.out.println("LTE에 연결되었습니다.");
    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> " + msg);
    }
}
