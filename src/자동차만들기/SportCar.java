package 자동차만들기;

public class SportCar extends Car {

    public SportCar(String name) {
        super(250, 8, 30, 2, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }
    /// /////////////////////////////////////////
    @Override
    public void airconOn() {
        airconState = true;
        fuelEff *= 0.95; // 연비 -5%
    }
    @Override
    public void airconOff() {
        airconState = false;
    }
    /// ////////////////////////////////////
    @Override
    public void audioOn() {
        audioState = true;
    }
    @Override
    public void audioOff() {
        audioState = false;
    }

    @Override
    public void autoPilotOn() {

    }

    @Override
    public void autoPilotOff() {

    }

    /// ////////////////////////////////////

}

class Sedan extends Car {

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

    @Override
    public void airconOn() {
        airconState = true;
        fuelEff *= 0.95; // 연비 -5%
    }
    @Override
    public void airconOff() {
        airconState = false;
    }

    @Override
    public void audioOn() {
        audioState = true;
    }
    @Override
    public void audioOff() {
        audioState = false;
    }

    @Override
    public void autoPilotOn() {
        autoPilotState = true;
        maxSpeed *= 0.9; //  최고속도 -10%
    }

    @Override
    public void autoPilotOff() {
        autoPilotState = false;
    }
}

class Bus extends Car {

    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
    }

    @Override
    public void airconOn() {
        airconState = true;
        fuelEff *= 0.95; // 연비 -5%
    }
    @Override
    public void airconOff() {
        airconState = false;
    }

    @Override
    public void audioOn() {

    }

    @Override
    public void audioOff() {

    }

    @Override
    public void autoPilotOn() {
        autoPilotState = true;
        maxSpeed *= 0.9; //  최고속도 -10%
    }

    @Override
    public void autoPilotOff() {
        autoPilotState = false;
    }
}