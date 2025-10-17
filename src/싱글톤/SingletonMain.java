package 싱글톤;
// 싱글톤 : 프로그램 전체에서 단 하나의 객체만 만들도록 보장해야 하는 경우에 사용
// 사용 목적은 주로 메모리 낭비 최소화, 클래스간의 데이터 공유
// 싱글톤 패턴 사용 시 동시성 문제가 발생할 수 있음 (자바에서 동시성 문제를 해결하기 위해서는 synchronized 사용

public class SingletonMain {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        st1.setInfo("장원영", 200);
        st2.viewInfo();
    }
}
