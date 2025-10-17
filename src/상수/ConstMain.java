package 상수;

import java.util.Scanner;

import static 상수.ConstantString.DOMAIN;

public class ConstMain {
    public static void main(String[] args) {
        final double TAX_RATE; // 상수는 관례상 대문자로 사용
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위해 스캐너 객체 생성
        System.out.print("수입을 입력하세요 : ");
        TAX_RATE = 0.10; // 자바는 선언 이후 단 한번 상수에 값 대입이 가능
        int income = sc.nextInt(); // 키보드로부터 정수값을 입력받아 정수형 변수인 income에 대입
        System.out.println("당신이 내야 할 세금은 " + (income * TAX_RATE) + "입니다.");

        System.out.println("도메인 : " + DOMAIN);
    }
}
