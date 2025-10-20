package 리스트기본;
// List 인터페이스 : ArrayList, LinkedList, Vector에 대한 설계명세
// - 크기가 정해져 있지 않음, 순서 유지, 중복 허용, 다양한 메서드 제공

import java.util.ArrayList;
import java.util.List;

public class ListBasicMain {
    public static void main(String[] args) {
        // List 인터페이스의 참조 변수에 ArrayList 객체의 주소를 대입
        List<String> fruits = new ArrayList<>();

        // 요소 추가
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");

        // ArrayList가 toString()을 오버라이딩 했음
        System.out.println("과일 목록 : " + fruits);

        // 특정 인덱스의 요소 추가
        fruits.add(2, "포도");
        System.out.println("과일 목록 : " + fruits);

        // 요소 가져오기 (인덱스 접근, 인덱스는 0부터 시작)
        System.out.println(fruits.get(3));

        // 요소 제거
        fruits.remove(2);   // 해당 인덱스 값을 제거
        System.out.println(fruits);

        // 향상된 for로 반복하기
        for(String e : fruits) {
            System.out.print(e + " ");
        }
        System.out.println();

        // 리스트의 크기 가져오기
        System.out.println(fruits.size());

        // 리스트에 값 포함 여부 확인
        System.out.println(fruits.contains("오렌지"));
    }
}
