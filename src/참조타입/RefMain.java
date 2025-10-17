package 참조타입;

public class RefMain {
    public static void main(String[] args) {
        String name1 = "안유진";
        String name2 = "안유진";
        String name3 = new String("안유진");

        if (name1 == name3) {   // 주소가 같은지를 비교함
            System.out.println("name1과 name2의 주소가 같음");
        } else System.out.println("name1과 name2의 주소가 다름");

        if (name1.equals(name3)) {   // 문자열 내용이 같은지를 비교함
            System.out.println("name1과 name2의 주소가 같음");
        } else System.out.println("name1과 name2의 주소가 다름");
    }
}
