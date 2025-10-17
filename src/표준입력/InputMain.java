package 표준입력;

// 자바는 JVM에서 main() 메서드를 호출하면서 프로그램이 시작됨
// Scanner 클래스를 통한 표준 입력
import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {
        // 스캐너 클래스의 참조 변수에 스캐너 객체 생성 후 대비
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();         // byte 형 입력 및 리턴
        short b = sc.nextShort();       // short 형 입력 및 리턴
        int c = sc.nextInt();           // int 형 입력 및 리턴
        long d = sc.nextLong();         // long 형 입력 및 리턴
        char ch = sc.next().charAt(0);  // 문자 입력

        float e = sc.nextFloat();       // float 형 입력 및 리턴
        double f = sc.nextDouble();     // double 형 입력 및 리턴

        boolean g = sc.nextBoolean();   // boolean 형 입력 및 리턴

        String h = sc.next();           // String 형 입력 및 리턴
        String i = sc.nextLine();       // String 형 입력 및 리턴
    }
}
