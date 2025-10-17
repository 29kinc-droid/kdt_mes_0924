package 표준입력실습;

import java.util.Scanner;

// 이름(next()), 전화번호(next()), 주소(nextLine()), 성별(char), 나이(int), 직업(문자열)을 입력 받아 이쁘게 출력하기
// 스캐너 연속 입력 시 버퍼 비우기 필요할 수있음 : sc.nextLine()
public class InputExMain {
    public static void main(String[] args) {
        String name;
        String phone;
        String address;
        char gender;
        int age;
        String job;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        name = sc.next();
        sc.nextLine();
        System.out.print("전화번호를 입력해주세요 : ");
        phone = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력해주세요 : ");
        address = sc.nextLine();
        System.out.print("성별을 입력해주세요 : ");
        gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("나이를 입력해주세요 : ");
        try {
            age = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.print("직업을 입력해주세요 : ");
        job = sc.next();
        sc.nextLine();

        System.out.println("------------------------------------------------");
        System.out.println("이름 : " + name);
        System.out.println("전화번호 : " + phone);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("직업 : " + job);
        System.out.println("------------------------------------------------");
    }
}
