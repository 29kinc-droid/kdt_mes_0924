package 열거클래스;
// 열거 타입 : 한정된 상수 집합을 정의할 수 있는 참조 타입
// - 비교 시 값 뿐만 아니라 타입도 검사
// - 기존의 public static final 상수를 대체하기도 함

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnumMatin {
    public static void main(String[] args) {
        List<Developer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            System.out.println("[" + (i + 1) + "번째 개발자 입력]");
            Developer dev = new Developer();
            // 이름 입력
            System.out.print("이름 입력 : ");
            dev.setName(sc.next());
            // 개발 업무 선택 : [1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI
            System.out.println("개발 업무 선택 : [1]FRONTEND [2]BACKEND [3]FULLSTACK [4]MOBILE [5]AI");
            switch (sc.nextInt()) {
                case 1 : dev.setType(DevType.FRONTEND); break;
                case 2 : dev.setType(DevType.BACKEND); break;
                case 3 : dev.setType(DevType.FULLSTACK); break;
                case 4 : dev.setType(DevType.MOBILE); break;
                case 5 : dev.setType(DevType.AI); break;
            }
            // 경력 입력 : [1]JUNIOR [2]SENIOR
            System.out.println("경력 입력 : [1]JUNIOR [2]SENIOR");
            switch (sc.nextInt()) {
                case 1 : dev.setCareer(Career.JUNIOR); break;
                case 2 : dev.setCareer(Career.SENIOR); break;
            }
            // 성별 입력 : [1]MALE [2]FEMALE
            System.out.println("성별 입력 : [1]MALE [2]FEMALE");
            switch (sc.nextInt()) {
                case 1 : dev.setGender(Gender.MALE); break;
                case 2 : dev.setGender(Gender.MALE); break;
            }
            list.add(dev);
        }

        // 개발자 목록 출력
        for(Developer e : list) {
            System.out.println(e.toString());
        }
    }
}
