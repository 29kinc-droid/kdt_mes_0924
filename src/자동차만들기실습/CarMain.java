package 자동차만들기실습;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car tmpCar = new TmpCar("tmpCar");

        System.out.println(tmpCar.calcTotalMoveCount(21));
        System.out.println(tmpCar.calcTotalMoveDistance(400,21));
        System.out.println(tmpCar.calcTotalFuelConsumption(400,21));
        System.out.println(tmpCar.calcTotalCost(400, 21));
        System.out.println(tmpCar.calcRefuelCount(400, 21));
        System.out.println(tmpCar.calcTotalDuration(400, 21, 1.0));
    }
    public class Distance {
        public static final int BUSAN = 400;
        public static final int JEJU = 400;



    };
    int a = Distance.JEJU;
}
