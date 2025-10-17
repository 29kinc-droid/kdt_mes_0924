package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton();
    private Singleton() {   // 외부 생성을 막기 위해 private 접근 제한자 사용
        name = "안유진";
        id = 100;
    }
    static Singleton getSingleton() {   // 메서드 호출 시 생성된 객체의 주소를 전달
        return singleton;
    }
}
