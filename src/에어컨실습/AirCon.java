package 에어컨실습;

// 기능 설계
// 전원 ON/OFF 기능
// 온도 설정 기능 (1도 단위 설정)
// 현재 온도 표시 기능
// 냉방기 ON/OFF 기능
// 난방기 ON/OFF 기능
// 바람세기 설정 (1단계 / 2단계 / 3단계)

// 인스턴스 필드, 게터, 세터, 생성자 만들기

import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    private boolean isPower;
    private int setTemp;
    private int currTemp;
    private boolean isCooler;
    private boolean isHeater;
    private int windStep;
    private final Scanner sc;

    public AirCon(boolean power, int setTemp, boolean cooler, boolean heater, int step) {
        final int[] monthArr = {-5, 3, 10, 15, 22, 28, 32, 30, 24, 16, 8, 4};
        Calendar now = Calendar.getInstance();  // 운영체제로부터 현재 날짜와 시간 정보를 가져옴
        int month = now.get(Calendar.MONTH);    // 현재 몇 월인지의 정보가 배열의 인덱스와 동일하게 넘어옴
        this.isPower = power;
        this.setTemp = setTemp;
        this.currTemp = monthArr[month];
        this.isCooler = cooler;
        this.isHeater = heater;
        this.windStep = step;
        sc = new Scanner(System.in);
    }
    // 에어컨 정보 출력하기, 온도가 변경되면 정보를 출력
    void airConInfo() {
        final String[] step = {"", "1단계", "2단계", "3단계"};
        System.out.println("=".repeat(10) + "에어컨 정보" + "=".repeat(10));
        System.out.println("전원 : " + (isPower ? "ON" : "OFF"));
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("쿨러 : " + (isCooler ? "ON" : "OFF"));
        System.out.println("히터 : " + (isHeater ? "ON" : "OFF"));
        System.out.println("바람 세기 : " + step[windStep]);

    }
    // 전원 설정 기능, 세터
    public void setPower(boolean power) {
        isPower = power;
    }

    // 바람세기 설정 기능, 세터
    public void setWindStep(int windStep) {
        this.windStep = windStep;
    }

    // 온도 설정에 대한 세터
    public void setSetTemp(int setTemp) {
        this.setTemp = setTemp;
    }

    // 현재 온도 변경 기능 (시뮬레이션 동작), 세터
    public void setCurrTemp(int n) {
        currTemp += n;
    }

    // 현재 온도 확인, 게터
    public int getCurrTemp() {
        return currTemp;
    }

    // 설정 온도 확인, 게터
    public int getSetTemp() {
        return setTemp;
    }

    // 바람세기 확인, 게터
    public int getWindStep() {
        return windStep;
    }

    // 에어컨 설정하기
    public void setAirCon() {
        // 현재 온도 알려 주기
        System.out.println("현재 온도는 " + currTemp + "도 입니다");

        // 온도 설정
        System.out.println("온도를 입력해주세요 (18 ~ 30)");
        int input = sc.nextInt();
        if(input >= 18 && input <= 30) {
            setSetTemp(input);
        }
        else System.out.println("설정온도가 적정 범위를 벗어났습니다");

        // 바람세기 설정
        System.out.println("바람세기를 입력해주세요 (1 ~ 3)");
        input = sc.nextInt();
        if(input >= 1 && input <= 3) {
            setWindStep(input);
        }
        else System.out.println("바람 세기가 적정 범위를 벗어났습니다");

        // 조건에 따라서 히터와 쿨러 켜고 끄기
        if(currTemp > setTemp) {
            System.out.println("냉방을 시작합니다");
            isHeater = false;
            isCooler = true;
        }
        else if(currTemp < setTemp) {
            System.out.println("난방을 시작합니다");
            isCooler = false;
            isHeater = true;
        }
    }
}
