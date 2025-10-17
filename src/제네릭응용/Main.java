package 제네릭응용;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeviceController<Device> dc = new DeviceController<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("기기 선택 [1]프린터 [2]모니터 [3]키보드");
            try{
                switch (sc.nextInt()) {
                    case 1:
                        dc.setDevice(new Printer());
                        break;
                    case 2:
                        dc.setDevice(new Monitor());
                        break;
                    case 3:
                        dc.setDevice(new KeyBoard());
                        break;
                    default:
                        System.out.println("메뉴 중에서 선택해주세요");
                        continue;
                }
            } catch (Exception e) {
                sc.next();
                System.out.println("정수를 입력해주세요");
                continue;
            }
            break;
        }
        dc.powerOn();
        dc.powerOff();
    }
}
