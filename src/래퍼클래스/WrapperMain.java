package 래퍼클래스;
// Wrapper 클래스 : 기본 타입의 데이터를 객체로 취급해야 하는 경우(제네릭, 컬렉션 프레임워크) 사용

public class WrapperMain {
    public static void main(String[] args) {
        int kor = 89;  // 기본타입에 값을 대입하기 때문에 아무일도 안 일어남
        Integer eng = 90;  // Wrapper 클래스 타입에 값을 대입했기 때문에 내부적으로 Boxing 동작이 일어남
        int total = kor + eng;  // Unbox 동작이 일어남
    }
}
