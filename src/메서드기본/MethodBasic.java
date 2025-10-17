package 메서드기본;
// 메서드 : 클래스 내부에 정의되는 동작(기능)을 수행하는 함수입니다.
// 자바는 클래스 기반 언어이기 때문에 모든 함수는 메서드 형태로 클래스 내부에 정의되어야 합니다.
// 함수는 독립적으로 정의 가능하지만 자바에서는 불가능 (자바는 함수가 존재하지 않음)
// 메서드의 구성 요소
// 접근제한자 : public, private, default..
// 반환 타입 : 메서드 수행 후 결과를 돌려주는 타입 (void인 경우는 반환값이 없음)
//

public class MethodBasic {
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(sample.sum(100, 200));
        sample.sum();
        System.out.println(sample.sum1(100));
        System.out.println(sample.sum(100,200,300,400,500,600));
    }
}

class Sample {
    // 반환값이 정수 타입, 메서드 이름은 sum, 매개변수는 (int a, int b)
    // 매개변수도 있고, 반환값도 있는 메서드
    public int sum(int a, int b) {
        return a + b;
    }
    // 매개변수를 통한 입력값이 없고, 반환값도 없음
    public void sum() {
        System.out.println("안녕하세요.");
    }
    // 매개변수를 통한 입력값이 없고, 반환값은 있음
    public int sum1(int a) {
        return 100 + 200;
    }
    // 매개변수의 수를 모르는 경우
    public  int sum(int ...val) {
        int sum = 0;
        for(int e : val) {
            sum += e;
        }
        return sum;
    }
}