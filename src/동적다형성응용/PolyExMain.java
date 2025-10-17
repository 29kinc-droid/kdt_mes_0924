package 동적다형성응용;

import java.util.Scanner;

public class PolyExMain {
    public static void main(String[] args) {
        Driver driver = new Driver("장원영");
        Scanner sc = new Scanner(System.in);
        System.out.print("운전할 차랑 선택 [1]스포츠카 [2]승용차 [3]SUV : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 : driver.drive(new SportCar()); break;
            case 2 : driver.drive(new Sedan()); break;
            case 3 : driver.drive(new Suv()); break;
            default : System.out.println("차량 선택이 잘못되었습니다.");
        }

    }
}
