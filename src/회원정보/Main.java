package 회원정보;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.next();

        int age = -1;
        while(age > 199 || age < 0) {
            System.out.print("나이를 입력해주세요 (0 ~ 199) : ");
            age = sc.nextInt();
        }

        char gender = 0;
        while("MmFf".indexOf(gender) == -1) {
            System.out.print("성별을 입력해주세요 (M or F) : ");
            gender = sc.next().charAt(0);
        }

        int job = 0;
        while(job > 4 || job < 1) {
            System.out.print("직업을 입력해주세요 (1: 학생, 2: 회사원, 3: 주부, 4: 무직) : ");
            job = sc.nextInt();
        }

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        switch (gender) {
            case 'M', 'm' : System.out.println("성별 : 남성"); break;
            case 'F', 'f' : System.out.println("성별 : 여성"); break;
        }
        switch (job) {
            case 1 : System.out.println("직업 : 학생"); break;
            case 2 : System.out.println("직업 : 회사원"); break;
            case 3 : System.out.println("직업 : 주부"); break;
            case 4 : System.out.println("직업 : 무직"); break;
        }
    }
}
