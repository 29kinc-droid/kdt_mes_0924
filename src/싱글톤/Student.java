package 싱글톤;

public class Student {
    Singleton singleton = Singleton.getSingleton(); // 외부에서 생성된 싱글톤 객체를 주입받음

    void setInfo(String name, int id) {
        singleton.name = name;
        singleton.id = id;
    }
    void viewInfo() {
        System.out.println("이름 : " + singleton.name);
        System.out.println("아이디 : " + singleton.id);
    }
}
