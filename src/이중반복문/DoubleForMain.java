package 이중반복문;
// 2중 for문은 for문 내에 for문이 존재함

import java.util.Scanner;

public class DoubleForMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("정수 입력 : ");
//        int num = sc.nextInt(); // 스캐너 객체를 통해 정수를 입력받음
//        for (int i = 0; i < num; i++) {
//            System.out.print("[i=" + i + "] ");
//            for (int j = 0; j < num; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // 2중 for문을 이용해서 구구단 2단 ~ 9단까지 출력하기
//        for (int i = 2; i <= 9; i++) {
//            System.out.println(i + "단");
//            for( int j = 1; j <= 9; j++) {
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }
        // 별찍기 : 5
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        System.out.print("수를 입력해주세요 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++ ) {
            for (int j = 0; j <= i; j ++) {
                System.out.print("* ");
            }
            System.out.print("\b\n");
        }
    }
}
