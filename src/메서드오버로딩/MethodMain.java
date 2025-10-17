package 메서드오버로딩;

public class MethodMain {
    public static void main(String[] args) {
        System.out.println(sum(100, 200));
        System.out.println(sum(100, 200, 300));
        System.out.println(sum(100, 3.14, 3300));
        // 문자열 2개와 정수 1개를 더하는 메서드
        System.out.println(sum("안", "유진", 100));
        // 실수형 3개를 더하는 메서드
        System.out.println(sum(2.3, 44.1, 0.2));
        // 문자열 3개를 더하는 메서드
        System.out.println(sum("대전", "대덕구", "석봉동"));

    }

    static int sum(int x, int y) {
        return x + y;
    }
    // 매개변수 갯수가 다름
    static int sum(int x, int y, int z) {
        return x + y + z;
    }
    // 매개변수의 타입이 다름
    static double sum(int x, double y, int z) {
        return x + y + z;
    }
    static String sum(String x, String y, int z) {
        return x + y + z;
    }
    static double sum(double x, double y, double z) {
        return x + y + z;
    }
    static String sum(String x, String y, String z) {
        return x + y + z;
    }
}
