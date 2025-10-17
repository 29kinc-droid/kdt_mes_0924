package 연산자;
// 연산자는 프로그램에서 변수의 값을 계산하고 비교하는 역할을 함
// 산술연산자 : +, -, *, /, %
// 대입연산자 : =, +=, -=, /=, %=
// 증감연산자 : ++, --
// 비교연산자 : >, <, >=, <=, !=
// 논리연산자 : || (or 연산자), &&(and 연산자), !(부정의 연산자)
// 삼항연산자 : 조건식 ? 참인경우 : 거짓인경우
// 비트연산자 : 비트 단위의 연산 수행

import java.util.Scanner;

public class OperateMain {
    public static void main(String[] args) {
        int x = 10, y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);  // 정수끼리 나눗셈은 몫을 구하는 연산이 됨
        System.out.println((float) x / (float) y);
        System.out.println(x % y);  // % 나머지 연산자

        // 대입 연산자 =, +-, -=, *=, /=, %=
        // 대입은 변수에 우변 값을 집어넣는것
        System.out.println(x += 2); // x = x + 2
        System.out.println(x -= 2);
        System.out.println(x *= 2); // 20
        System.out.println(x /= 2); // 10
        System.out.println(x %= 2); // 0

        // 증감 연산자 : 단항연산자, 피연산자의 값을 1씩 증가 또는 감소시킴, 연산자의 위치에 따라 결과가 달라짐
        int z = 10;
        System.out.println(z++); // 선 대입 후 증가
        System.out.println(z);

        // 비교 연산자 : 비교 결과를 참과 거짓으로 반환
        int num1 = 10, num2 = 20;
        System.out.println(num1 > num2);    // false
        System.out.println(num1 < num2);    // true
        System.out.println(num1 >= num2);   // false
        System.out.println(num1 <= num2);   // true
        System.out.println(num1 != num2);   // true

        // 논리 연산자 : 연산식을 비교해서 참과 거짓을 판단
        // && : AND, 좌변과 우변이 모두 참인 조건
        // || : OR, 둘 중 하나만 참이면 참
        // ! : NOT, 현재의 조건을 부정함
        System.out.println(num1 > 0 && num1 > num2);    // false    //비교연산자가 논리연산자보다 우선 순위가 높음
        System.out.println(num1 > 0 || num1 > num2);    // true
        System.out.println(!(num1 > 0 || num1 > num2)); // false

        // 삼항연산자 : 항이 3개인 연산자, 간단한 조건문을 대체할 수 있음

        // 실습문제1
        // 1000자리 정수를 입력받아 4개의 변수에 나누어 담고, 가장 큰 수 출력하기

        Scanner sc = new Scanner(System.in);
        System.out.println("1000자리의 수를 입력해주세요 : ");
        int input = sc.nextInt();
        int a = input / 1000;
        int b = input / 100 % 10;
        int c = input / 10 % 10;
        int d = input % 10;

        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        System.out.println("가장 큰 숫자는 " + max + "입니다");


        // 실습문제2
        // 스캐너로 나이를 입력받아 나이가 20살 이상이면 나이와 "성인"을 출력, 아니면 나이와 "미성년자"를 출력하기
        System.out.println("나이를 입력해주세요 : ");
        int age = sc.nextInt();
        System.out.println("나이 : " + age);
        System.out.println("성인여부 : " + ((age >= 20)? "성인" : "미성년자"));

    }
}
