package 자동차만들기old;

import java.util.Scanner;

public class InputHandler {
    private final Scanner sc = new Scanner(System.in);
    // 이동 지역 선택
    public int getLocation() {
        int loc;
        while (true) {
            System.out.print("이동 지역 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            loc = sc.nextInt();
            if (loc >= 1 && loc <= 4) return loc;
            System.out.println("이동할 지역 선택이 잘 못 되었습니다.");
        }
    }

    // 승객 수 입력
    public int getPassengerCnt() {
        int cnt;
        while (true) {
            System.out.print("이동할 승객 수 입력(1 ~ 100) : ");
            cnt = sc.nextInt();
            if (cnt >= 1 && cnt <= 100) return cnt;
            System.out.println("승객 수는 1 ~ 100 사이여야 합니다.");
        }
    }

    // 차량 종류 선택
    public int getCarType() {
        int type;
        while (true) {
            System.out.print("차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            type = sc.nextInt();
            if(type >= 1 && type <= 3) return type;
            System.out.println("차량 선택이 잘 못 되었습니다.");
        }
    }

    // 부가 기능 선택
    public  boolean getOptionMode() {
        int option;
        while (true) {
            System.out.print("부가 기능 [1]ON [2]OFF : ");
            option = sc.nextInt();
            if(option == 1 || option == 2) return option == 1;
            System.out.println("모드 선택이 잘 못 되었습니다.");
        }
    }

    // 날씨 선택
    public int getWeather() {
        int weather;
        while (true) {
            System.out.print("날씨 선택 [1]맑음 [2]비 [2]눈 : ");
            weather = sc.nextInt();
            if (weather >= 1 && weather <= 3) return weather;
            System.out.println("날씨 선택이 잘 못 되었습니다.");
        }

    }

    public boolean getAircon(String carName) {
        int aircon;
        while (true) {
            System.out.print(carName + " 에어컨 [1]ON [2]OFF : ");
            aircon = sc.nextInt();
            if(aircon == 1 || aircon == 2) {
                System.out.println(carName + ": 에어컨 " + (aircon==1?"ON":"OFF"));
                return aircon == 1;
            }
            System.out.println("에어컨 선택이 잘 못 되었습니다.");
        }
    }

    public boolean getAutoPilot(String carName) {
        int autoPilot;
        while (true) {
            System.out.print(carName + " 자율주행 [1]ON [2]OFF : ");
            autoPilot = sc.nextInt();
            if(autoPilot == 1 || autoPilot == 2) {
                System.out.println(carName + ": 자율주행 " + (autoPilot==1?"ON":"OFF"));
                return autoPilot == 1;
            }
            System.out.println("자율주행 선택이 잘 못 되었습니다.");
        }
    }

    public boolean getAudio(String carName) {
        int audio;
        while (true) {
            System.out.print(carName + " 오디오 [1]ON [2]OFF : ");
            audio = sc.nextInt();
            if(audio == 1 || audio == 2) {
                System.out.println(carName + ": 오디오 " + (audio==1?"ON":"OFF"));
                return audio == 1;
            }
            System.out.println("오디오 선택이 잘 못 되었습니다.");
        }
    }

    // 에어컨 선택
    
}
