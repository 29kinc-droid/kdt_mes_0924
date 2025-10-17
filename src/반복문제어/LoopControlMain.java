package 반복문제어;

import java.util.Scanner;

// break    : 반복문 탈출, switch문 탈출
// continue : 반복문의 나머지 수행 부분을 건너뛰고 조건식으로 이동
// 입력된 정수값 범위 내에서 3의 배수만 제외하고 출력하기
// 한줄에 10개씩 출력
public class LoopControlMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            if(i%3 == 0) continue;
            System.out.printf("%3d ", i);
            cnt++;
            if(cnt == 10) {
                System.out.println();
                cnt = 0;
            }
        }
    }
}
