package 매쓰응용문제;
// 1. 주사위 두 개 굴리기
// - 두 주사위의 값을 출력
// - 두 주사위의 합계를 출력
// - 두 주사위의 값이 같은 수면 "더블!" 문구 출력

// 2. 절대값 계산기
// - Scanner로 정수 두 개 입력받기
// - 두 수의 차이를 절대값으로 출력 => "두 수의 차이는 XX입니다

// 3. 점수 반올림 프로그램
// - 실수형으로 점수를 입력 받음
// - 입력받은 점수를 내림, 올림, 반올림한 점수 출력하기


import java.util.Scanner;

public class MathExMain {
    public static void main(String[] args) {
        int dice1 = 1 + (int)(Math.random()*6), dice2 = 1 + (int)(Math.random()*6);
        System.out.println("두 주사위의 값은 " + dice1 + ", " + dice2);
        System.out.println("두 주사위의 합계는 " + (dice1 + dice2));
        if(dice1 == dice2) System.out.println("더블!");

        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력해주세요");
        int n1 = sc.nextInt();
        System.out.println("두번째 정수를 입력해주세요");
        int n2 = sc.nextInt();
        System.out.println("두 수의 차이는 " + Math.abs(n1 - n2) + "입니다.");

        System.out.println("실수를 입력해주세요");
        float f = sc.nextFloat();
        System.out.println("내림 : " + (int)Math.floor(f));
        System.out.println("올림 : " + (int)Math.ceil(f));
        System.out.println("반올림 : " + Math.round(f));
        // 수학적인 연산을 통해서 구하기
        System.out.println("소수점 두번째 자리 출력 : " + Math.round(f*100)/100);
        // 서식지정자를 사용하는 방법
        System.out.printf("소수점 두번째 자리 출력 : %.2f\n", f);
    }
}
