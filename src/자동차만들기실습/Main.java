package 자동차만들기실습;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###"); // 금액 형식용

        System.out.println("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int region = sc.nextInt();

        int distance = switch (region) {
            case 1 -> 400; // 서울→부산 약 400km
            case 2 -> 150; // 서울→대전
            case 3 -> 200; // 서울→강릉
            case 4 -> 300; // 서울→광주
            default -> 0;
        };

        System.out.print("이동할 승객 수 입력 : ");
        int passengers = sc.nextInt();

        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int select = sc.nextInt();

        Car car;
        switch (select) {
            case 1 -> car = new SportsCar();   // 스포츠카
            case 2 -> car = new Sedan();       // 승용차
            case 3 -> car = new Bus();         // 버스
            default -> {
                System.out.println("잘못된 입력으로 기본값(승용차) 선택");
                car = new Sedan();
            }
        }

        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int mode = sc.nextInt();
        car.setMode(mode == 1);

        System.out.print("날씨 [1]맑음 [2]비 [3]눈 : ");
        int weather = sc.nextInt();

        double weatherFactor = switch (weather) {
            case 1 -> 1.0;
            case 2 -> 1.2;
            case 3 -> 1.4;
            default -> 1.0;
        };

        // 계산
        int totalCost = car.calcTotalCost(distance, passengers);
        int refuelCount = car.calcRefuelCount(distance, passengers);
        double totalHours = car.calcTotalDuration(distance, passengers, weatherFactor);

        int hours = (int) totalHours;
        int minutes = (int) Math.round((totalHours - hours) * 60);

        System.out.println();
        System.out.println("=======" + car.getName() + "=======");
        System.out.println("총 비용 : " + df.format(totalCost) + "원");
        System.out.println("총 주유 횟수 : " + refuelCount + "회");
        System.out.printf("총 이동 시간 : %d시간 %d분%n", hours, minutes);
    }
}