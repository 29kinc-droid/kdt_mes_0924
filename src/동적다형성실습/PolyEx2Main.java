package 동적다형성실습;

public class PolyEx2Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.send(new ParcelDelivery("CJ"));
        manager.send(new QuickDelivery("한진"));
        manager.send(new AirDelivery("대한"));
    }
}
