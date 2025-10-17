package 제네릭응용;

public class DeviceController <T extends Device>{
    private T device;
    public void setDevice(T device) {
        this.device = device;
    }
    public void powerOn() {
        device.turnOn();
    }
    public void powerOff() {
        device.turnOff();
    }
}
