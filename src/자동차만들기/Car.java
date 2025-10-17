package 자동차만들기;

import java.text.DecimalFormat;
import static 자동차만들기.Common.FUEL_PRICE;

public abstract class Car {
    protected int maxSpeed;  // 최고 속도
    protected int fuelEff;   // 연비
    protected int fuelTank;  // 연료탱크 크기
    protected int seatCnt;   // 좌석 수
    protected String name;   // 자동차 이름
    protected boolean airconState;
    protected boolean audioState;
    protected boolean autoPilotState;

    public Car(int maxSpeed, int fuelEff, int fuelTank, int seatNum, String name) {
        this.maxSpeed = maxSpeed;
        this.fuelEff = fuelEff;
        this.fuelTank = fuelTank;
        this.seatCnt = seatNum;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    // 이동 횟수 : 승객 수를 입력 받아 이동 횟수를 구하기
    int getMovingCnt(int passCnt) {
        return (int) Math.ceil((double) passCnt / seatCnt);
    }
    // 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {
        double totalDistance = dist * moveCnt;
        double totalFuel = totalDistance / fuelEff; // 연료 소모량
        return (int) Math.ceil(totalFuel / fuelTank); // 주유 횟수 반환
    }

    // 총 비용
    String getTotalCost(int dist, int moveCnt) {
        double totalDistance = dist * moveCnt;
        double totalFuel = totalDistance / fuelEff; // 연료 소모량
        long totalCost = Math.round((totalFuel * FUEL_PRICE));
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(totalCost);
    }

    // 소요 시간
    String getMovingTime(int dist, int moveCnt, int weather) {
        double getTime = (double) dist * moveCnt / maxSpeed;

        switch (weather) {
            case 2: getTime *= 1.2; break;
            case 3: getTime *= 1.4; break;
            default:
        }
        int totalMin = (int) (getTime * 60);
        int hour = totalMin / 60;
        int min = totalMin % 60;
        return String.format("%d시간 %d분", hour, min);
    }

    // 구현부가 없는 추상 메서드를 정의하면 상속 받은 클래스에서 반드시 오버라이딩 해야 함
    abstract void setMode(boolean isMode);

    public abstract void airconOn();

    public abstract void airconOff();

    public abstract void audioOn();

    public abstract void audioOff();

    public abstract void autoPilotOn();

    public abstract void autoPilotOff();
}
