package 에어컨실습;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAirCon = new AirCon(false, 22, false, false, 1);
        Scanner sc = new Scanner(System.in);
        System.out.print("에어컨 켜기 (yes / no) : ");
        String isON = sc.nextLine();
        if (isON.equalsIgnoreCase("yes")) {
            int elapsedTime = 0;    // 경과 시간 계산하기
            boolean changedTemp = false;    // 온도 변화 감지
            lgAirCon.setPower(true);    // 전원 켜기
            lgAirCon.setAirCon();       // 에어컨 설정
            while(true) {
                sleep(100);    // 1초 동안 대기
                elapsedTime++;
                switch (lgAirCon.getWindStep()) {
                    case 1 : if(elapsedTime >= 60) changedTemp = true; break;
                    case 2 : if(elapsedTime >= 30) changedTemp = true; break;
                    case 3 : if(elapsedTime >= 20) changedTemp = true; break;
                    default:
                        System.out.print("바람세기 설정 오류");
                        if(elapsedTime >= 60) changedTemp = true;
                }
                if(changedTemp) {
                    if (lgAirCon.getCurrTemp() > lgAirCon.getSetTemp()) {
                        lgAirCon.setCurrTemp(-1);
                        changedTemp = false;
                        elapsedTime = 0;
                        lgAirCon.airConInfo();
                    }

                    else if (lgAirCon.getCurrTemp() < lgAirCon.getSetTemp()) {
                        lgAirCon.setCurrTemp(1);
                        changedTemp = false;
                        elapsedTime = 0;
                        lgAirCon.airConInfo();
                    }

                    if (lgAirCon.getCurrTemp() == lgAirCon.getSetTemp()) {
                        lgAirCon.setPower(false);
                        lgAirCon.airConInfo();
                        System.out.println("설정 온도 도달. 에어컨 종료");
                        return;
                    }
                }
            }
        }
    }
}
