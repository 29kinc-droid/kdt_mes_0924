package 비트연산;

// bit(비트) : 컴퓨터에서 사용되는 가장 작은 정보 단위(0/1)
// byte(바이트) : 8개의 비트로 구성된 데이터 단위

public class BitMain {
    public static void main(String[] args) {
        byte num1 = 10;
        byte num2 = 12;
        System.out.println(num1 & num2);    // & (bit and) : bit가 모두 1인 경우 1
        System.out.println(num1 | num2);    // | (bit or) : bit가 1개만 1이어도 1
        System.out.println(num1 ^ num2);    // ^ (xor) : 두 bit값이 서로 다른 경우 1
        System.out.println(~num1);          // ~ (bit not) : 비트의 값을 반전
        System.out.println(num1 << 1);      // << (left shift) : bit를 왼쪽으로 1만큼 이동
        System.out.println(num1 >> 1);      // >> (right shift) : bit를 오른쪽으로 1만큼 이동
        System.out.println(num1 + ~num1);
        System.out.println(num1 ^ ~num1);
    }
}
