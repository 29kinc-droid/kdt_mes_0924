package Super실습문제;

public class SuperExMain {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("씽씽이");
        sportCar.DisplayInfo();
        Car car = new Car(40, "black");
        car.DisplayInfo();
        Car tuningCar = new SportCar("튜닝카");
        tuningCar.DisplayInfo();
    }
}
