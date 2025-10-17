package 자동차만들기실습;

public class Bus extends Car {
    private boolean subTankOn = false;
    public Bus() {
        // 속도, 연비, 연료탱크, 좌석수, 이름
        super(150, 5, 100, 20, "현대 유니버스");
    }

    @Override
    public void setMode(boolean isOn) {
        subTankOn =isOn;
        if (subTankOn)
            System.out.println("보조 연료탱크 ON : 연료탱크 용량이 30L증가했습니다.");
        else
            System.out.println("보조 연료탱크 OFF : 기본 연료탱크로 운행합니다.");
    }
    @Override
    public int getFuelTankSize() {
        if (subTankOn) return superTankSize() + 30;
        return superTankSize();
    }

    private int superTankSize() {
        try {
            var field = Car.class.getDeclaredField("fuelTankSize");
            field.setAccessible(true);
            return field.getInt(this);
        } catch (Exception e) {
            return 0;
        }
    }
}