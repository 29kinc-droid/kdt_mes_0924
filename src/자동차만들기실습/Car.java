package 자동차만들기실습;

public abstract class Car {
    private final int speed;
    private final int efficiency;
    private final int fuelTankSize;
    private final int seatCount;
    private final String name;

    public Car(int speed, int efficiency, int fuelTankSize, int seatCount, String name) {
        this.speed = speed;
        this.efficiency = efficiency;
        this.fuelTankSize = fuelTankSize;
        this.seatCount = seatCount;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getEfficiency() {
        return efficiency;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public String getName() {
        return name;
    }

    public int calcTotalMoveCount(int passengerCount) {
        return (int)Math.ceil((double)passengerCount / getSeatCount());
    };

    public int calcTotalMoveDistance(int moveDistance, int passengerCount) {
        return moveDistance * calcTotalMoveCount(passengerCount);
    }

    public double calcTotalFuelConsumption(int moveDistance, int passengerCount) {
        return (double)calcTotalMoveDistance(moveDistance, passengerCount) / getEfficiency();
    }
    public int calcRefuelCount(int moveDistance, int passengerCount) {
        return (int)Math.ceil(calcTotalFuelConsumption(moveDistance, passengerCount) / getFuelTankSize());

    };
    public int calcTotalCost(int moveDistance, int passengerCount) {
        return (int)(calcTotalFuelConsumption(moveDistance, passengerCount) * 2000);

    };
    public double calcTotalDuration(int moveDistance, int passengerCount, double weatherAdjFactor) {
        return (double)moveDistance / getSpeed() * calcTotalMoveCount(passengerCount) * weatherAdjFactor;
    }

    public abstract void setMode(boolean isOn);

}
