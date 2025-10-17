package for실습2;

import java.util.Scanner;

public class ForExMain2 {
    public static void main(String[] args) {
        // 실습문제 2번
        // 입력받은 수의 범위 내의 5의 배수를 출력하기, 한줄에 10개씩 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int input = sc.nextInt();
        int pCount = 0;
        int dNumLen = Integer.toString(input - input%5).length();
        int dNumLen2 = 0;

        for(int i = 5; i <= input; i++){
           if(i%5 == 0) {
               dNumLen2 = Integer.toString(i).length();
               for(int j = 0; j < dNumLen - dNumLen2; j++) System.out.print(" ");
               System.out.print(i);
               pCount++;
               if(pCount == 10){
                   pCount = 0;
                   System.out.println();
               }
               else System.out.print(", ");
           }
        }
        System.out.print("\b\b");
    }
}
