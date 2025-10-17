package 조건문;

import java.util.Scanner;

// 제어문 : 원하는 결과를 얻기 위해 프로그램의 흐름을 제어하는 구문
// 조건문 : 주어진 조건식에 따라 조건을 분기하는 것
// 반복ㅁ누 : 주어진 조건이 참인 동안 반복수행
public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//         국어, 영어, 수학 성적을 입력 받음
//         이름을 입력 받음
//         국어, 영어, 수학 성적이, 0 미만이거나 100 초과이면 입력 오류라고 출력
//         정상적인 입력이면 총점과 평균을 구하고
//         평균이 90점 이상이면 이름과 총첨, 평균 등급 : A
//         평균이 80점 이상이면 이름과 총첨, 평균 등급 : B
//         평균이 70점 이상이면 이름과 총첨, 평균 등급 : C
//         평균이 60점 이상이면 이름과 총첨, 평균 등급 : D
//         나머지는 이름과 총첨, 평균 등급 : F

        int kor, eng, mat;
        String name;

        while(true) {
            System.out.println("국어 : ");
            kor = sc.nextInt();
            if(kor >= 0 && kor <= 100) break;
            System.out.println("잘못된 범위입니다. (0 ~ 100)");
        }
        while(true) {
            System.out.println("영어 : ");
            eng = sc.nextInt();
            if(eng >= 0 && eng <= 100) break;
            System.out.println("잘못된 범위입니다. (0 ~ 100)");
        }
        while(true) {
            System.out.println("수학 : ");
            mat = sc.nextInt();
            if(mat >= 0 && mat <= 100) break;
            System.out.println("잘못된 범위입니다. (0 ~ 100)");
        }
        System.out.println("이름 : ");
        name = sc.next();

        int sum = kor + eng + mat;
        float avg = (float) sum / 3;

        char grade;
        if(avg >= 90) grade = 'A';
        else if(avg >= 80) grade = 'B';
        else if(avg >= 70) grade = 'C';
        else if(avg >= 60) grade = 'D';
        else grade = 'F';
        System.out.println(name + ", 총 " + sum + "점, 평균 " + avg + "점, " + grade + "등급");
    }
}
