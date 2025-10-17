package Super실습문제;

public class SportCar extends Car{
    protected boolean isTurbo;

    public SportCar() {
        super();
        isTurbo = false;
    }

    public SportCar(String name) {
        super(280, "Red");
        isTurbo = true;
        this.name = name;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("터보 : " + (isTurbo?"있음":"없음"));
    }
}
