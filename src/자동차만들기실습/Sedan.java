package 자동차만들기실습;

public class Sedan extends Car {
    private boolean trunkSeatMode = false;
    public Sedan() {
        // 속도, 연비, 연료탱크, 좌석수, 이름
        super(200, 12, 45, 4, "그랜저");
    }

    @Override
    public void setMode(boolean isOn) {
        trunkSeatMode = isOn;
        if (trunkSeatMode)
            System.out.println("트렁크 좌석화 ON : 좌석이 1석 추가되었습니다!");
        else
            System.out.println("트렁크 좌석화 OFF : 기본 좌석으로 돌아갑니다");
    }
    @Override
    public int getSeatCount() {
        if (trunkSeatMode) return superSeatCount() + 1;
        return superSeatCount();
    }

    private int superSeatCount() {
        try {
            var field = Car.class.getDeclaredField("seatCount");
            field.setAccessible(true);
            return field.getInt(this);
        } catch (Exception e) {
            return 0;
        }
    }
}