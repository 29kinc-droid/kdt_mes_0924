package 상속기본;

public class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
}

// 상속은 extends 키워드를 사용, 부모가 가진 필드와 메서드를 물려받음

class Dog extends Animal {
    void sleep() {
        System.out.println(name + "(이)가 잠을 잡니다.~~~");
    }

}

class HouseDog extends Dog {
    @Override   // 오버라이드 관계가 성립하는지 문법적으로 체그하는 어노테이션
    void sleep() {
        System.out.println(name + "(이)가 집에서 잠을 잡니다.~~~");
    }
    // 메서드 오버로딩 (동일한 이름의 메서드를 매개변수의 개수나 타입을 구분해서 호출하는것)
    void sleep (int hour) {
        System.out.println(name + "(이)가 집에서 " + hour + "시간 동안 잠을 잡니다.~~~");
    }
}