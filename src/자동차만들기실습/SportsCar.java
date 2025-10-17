package 자동차만들기실습;

public class SportsCar extends Car {
    private boolean turboOn = false;
    public SportsCar() {
        // 속도, 연비, 연료탱크, 좌석수, 이름
        super(250, 8, 30, 2, "포르쉐 911");
    }

    @Override
    public void setMode(boolean isOn) {
        turboOn = isOn;
        if (turboOn) {
            System.out.println("터보 모드 ON: 속도가 20% 증가합니다!");
        } else {
            System.out.println("터보 모드 OFF: 기본 속도로 운행합니다.");
        }
    }
    @Override
    public int getSpeed() {
        if (turboOn) return (int)(superSpeed() * 1.2);
        return superSpeed();
    }

    private int superSpeed() {
        try {
            var field = Car.class.getDeclaredField("speed");
            field.setAccessible(true);
            return field.getInt(this);
        } catch (Exception e) {
            return 0;
        }
    }
}

