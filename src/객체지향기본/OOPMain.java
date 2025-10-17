package 객체지향기본;
// 클래스 : 객체를 생성하기 위한 설계도, 속성(필드)과 동작(메서드)를 정의
// 객체 : 클래스를 기반으로 생성된 실제 데이터, 메모리에 핧당된 인스턴스

import java.util.ArrayList;
import java.util.List;

// 객체지향 프로그래밍의 4가지 특징
// 1. 캡슐화 : 필드는 숨기고, 필드에 대한 접근을 메서드를 통해서 하도록 제한하는것, 데이터 은닉
// 2. 상속 : 부모 클래스의 필드와 메서드를 물려받는것
// 3. 다형성 : 부모로부터 물려받은 클래스의 메서드가 다양한 방식으로 동작하도록 하는 것, 오버로딩, 오버라이딩
// 4. 추상화 :
public class OOPMain {
    public static void main(String[] args) {
        MemberInfo member1 = new MemberInfo("ayj1111@gmail.com", "1234", "안유진", "대전", "010-5435-4532");
        MemberInfo member2 = new MemberInfo("ayj1111@gmail.com", "1234", "장원영", "대전", "010-5435-4532");
        MemberInfo member3 = new MemberInfo("ayj1111@gmail.com", "1234", "이서", "대전", "010-5435-4532");
        MemberInfo member4 = new MemberInfo("ayj1111@gmail.com", "1234", "레이", "대전", "010-5435-4532");
        MemberInfo member5 = new MemberInfo("ayj1111@gmail.com", "1234", "가을", "대전", "010-5435-4532");

        List<MemberInfo> list = new ArrayList<>();  // 배열과 비슷함
        list.add(member1);
        list.add(member2);
        list.add(member3);
        list.add(member4);
        list.add(member5);

        for(MemberInfo e : list) {
            System.out.println(e);
        }
    }
}
