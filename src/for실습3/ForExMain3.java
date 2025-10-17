package for실습3;

import java.util.Scanner;

public class ForExMain3 {
    public static void main(String[] args) {

        // 실습문제 3번
        // 정수를 입력받아 입력받은 정수 * 정수 크기의 행렬을 출력하는 프로그램 작성
        // 입력 : 4
        //  1  2  3  4
        //  5  6  7  8
        //  9 10 11 12
        // 13 14 15 16
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int input = sc.nextInt();
        int dNumLen = Integer.toString(input * input).length();
        int dNumLen2 = 0;

        for(int i = 0; i < input; i++){
            for(int j = 0; j < input; j++) {
                dNumLen2 = Integer.toString(i * input + j + 1).length();
                for(int k = 0; k < dNumLen - dNumLen2; k++) System.out.print(" ");
                System.out.print((i * input + j + 1) + " ");
            }
            System.out.print("\b");
            System.out.println();
        }
    }
}
