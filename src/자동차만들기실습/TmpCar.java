package 자동차만들기실습;

public class TmpCar extends Car{

    private boolean mode;

    public TmpCar(String name) {
        super(300, 8, 30, 2, name);
    }

    @Override
    public void setMode(boolean isOn) {
        this.mode = isOn;
    }
}
