package 자동차만들기old;

public class SportCar extends Car implements Aircon, Audio{

    public SportCar(String name) {
        super(250, 8, 30, 2, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) maxSpeed *= 1.2;
    }

    private boolean aircon;

    @Override
    public void setAircon(boolean isOn) {
        aircon = isOn;
        if (aircon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAircon() {
        return aircon;
    }

    private boolean audio;

    @Override
    public void setAudio(boolean isOn) {
        audio = isOn;
    }

    @Override
    public boolean isAudio() {
        return audio;
    }
}

class Sedan extends Car implements Aircon, AutoPilot, Audio{

    public Sedan(String name) {
        super(200, 12, 45, 4, name);
    }

    @Override
    void setMode(boolean isMode) {
        if(isMode) seatCnt += 1;
    }

    private boolean aircon;

    @Override
    public void setAircon(boolean isOn) {
        aircon = isOn;
        if (aircon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAircon() {
        return aircon;
    }

    private boolean audio;

    @Override
    public void setAudio(boolean isOn) {
        audio = isOn;
    }

    @Override
    public boolean isAudio() {
        return audio;
    }

    private boolean autoPilot;

    @Override
    public void setAutoPilot(boolean isOn) {
        autoPilot = isOn;
        if (autoPilot) maxSpeed *= 0.9;
    }

    @Override
    public boolean isAutoPilot() {
        return autoPilot;
    }
}

class Bus extends Car implements Aircon, AutoPilot{

    public Bus(String name) {
        super(150, 5, 100, 20, name);
    }

    @Override
    void setMode(boolean isMode) {
        if (isMode) fuelTank += 30;
    }

    private boolean aircon;

    @Override
    public void setAircon(boolean isOn) {
        aircon = isOn;
        if (aircon) fuelEff *= 0.95;
    }

    @Override
    public boolean isAircon() {
        return aircon;
    }

    private boolean autoPilot;

    @Override
    public void setAutoPilot(boolean isOn) {
        autoPilot = isOn;
        if (autoPilot) maxSpeed *= 0.9;
    }

    @Override
    public boolean isAutoPilot() {
        return autoPilot;
    }
}