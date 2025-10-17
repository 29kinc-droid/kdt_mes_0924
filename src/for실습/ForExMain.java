package for실습;

import java.util.Scanner;

public class ForExMain {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        // 합을 저장할 변수 생성 (초기화 필요)
        int sum = 0;
        System.out.println("수를 입력하세요");
        int input = sc.nextInt();
        // 범위 기반 반복문 생성
        for(int i = 2; i <= input; i++) {
            // 짝수 판별 조건 추가
            if (i%2 == 0) {
                // 짝수인 경우 값을 누적
                sum += i;
            }
        }
        // 반복문 종료 후 결과 출력
        System.out.println("범위내 짝수의 합은 " + sum + "입니다.");
    }
}
