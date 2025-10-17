package 회원정보객체지향;
// 이름, 나이, 성별, 직업

import java.util.Scanner;

public class Member {
    private String name;    // 인스턴스 필드
    private int age;
    private char gender;
    private int job;
    private Scanner sc = new Scanner(System.in);

    // 이름을 입력받는 메서드 구현
    public void setName() {
        System.out.print("이름을 입력하세요 : " );
        name = sc.next();
    }

    // 나이를 입력받는 메서드 구현
    public void setAge() {
        while(true){
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if(age >= 0 && age < 100) return;   // 메서드를 반환, 메서드가 끝남
            System.out.println("나이를 잘못 입력하셨습니다.");
        }
    }

    // 성별을 입력받는 메서드 구현
    public void setGender() {
        while(true) {
            System.out.print("성별을 입력하세요 : ");
            gender = sc.next().toLowerCase().charAt(0);
            if (gender == 'm' || gender == 'f') return;
            System.out.println("성별을 잘못 입력하셨습니다.");
        }
    }

    // 직업을 입력받는 메서드 구현
    // public 접근제한자는 누구나 접근 가능
    public void setJob() {
        while (true) {
            System.out.print("직업을 입력하세요 [1]학생 [2]회사원 [3]주부 [4]무직 : ");
            job = sc.nextInt();
            if (job > 0 && job < 5) return;
            System.out.println("직업을 잘못 입력하셨습니다.");
        }
    }

    public void viewMember() {
        // final을 사용해 문자열 배열의 내용을 변경할 수 없음을 지정
        final String[] jobStr = {"", "학생", "회사원", "주부", "무직"};  // 문자열 0번 인덱스를 비운 이유는 입력받는 값과 맞추기 위해서
        System.out.println("=".repeat(8) + "회원 정보" + "=".repeat(8));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + ((gender == 'm')?"남성":"여성"));
        System.out.println("직업 : " + jobStr[job]);

    }
}
