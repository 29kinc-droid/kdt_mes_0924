package 매쓰클래스;
// Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해 놓은 클래스 입니다.
// 한번 만들어진 함수들을 호출해서 사용하는 용도

public class MathMain {
    public static void main(String[] args) {
        // random() 메서드 : 0.0 ~ 1.0 미만의 범위에서 임의의 값 생성
        System.out.println(Math.random());
        // 1 ~ 100 사이의 임의의 수 10개 출력하기
        for(int i = 0; i < 10; i++) {
            System.out.print(1 + (int)(Math.random()*100) + ", ");
        }
        System.out.println("\b\b");

        // 절대값 : abs()
        System.out.println(Math.abs(100));
        System.out.println(Math.abs(-100));
        // floor() : 숫자를 내림
        // ceil(): 숫자를 올림
        // round() : 반올림(전달받은 실수를 소수점 첫째 자리를 반올림해서 정수를 만듬)
        System.out.println(Math.floor(10.9));
        System.out.println(Math.ceil(10.001));
        System.out.println(Math.round(10.5));

        // max(), main():
        System.out.println(Math.max(200, 100));
        System.out.println(Math.min(200, 100));

    }
}
