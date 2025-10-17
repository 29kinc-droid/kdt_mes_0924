package 제네릭;
// 제네릭 : 데이터의 타입을 일반화하여, 다양한 타입의 데이터를 하나의 코드로 처리할 수 있도록 해주는 자바의 기능
// - 유연하고 재사용 가능한 코드 작성이 가능
// - 컴파일 시 타입을 지정하여 타입 안정성을 확보
public class GenericMain {
    public static void main(String[] args) {
        Person<String> p1 = new Person<>("안유진");
        System.out.println(p1.getInfo());

        Person<Integer> p2 = new Person<>(1004);
        System.out.println(p2.getInfo());

    }
}

class Person<T> {
    private T info;
    public Person(T info) {
        this.info = info;
    }
    public T getInfo() {
        return info;
    }
}
