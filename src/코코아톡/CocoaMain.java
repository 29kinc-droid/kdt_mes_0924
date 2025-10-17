package 코코아톡;

import java.util.Scanner;

public class CocoaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NetAdapter adapter;
        CocoaTok cocoaTok;
        System.out.print("네트워크 선택 [1]WiFi [2]5G [3]LTE : ");
        int choice = sc.nextInt();

        // adapter에 연결할 네트워크 객체 주소를 대입
        switch (choice) {
            case 1 : adapter = new WiFi(); break;
            case 2 : adapter = new FiveG(); break;
            case 3 : adapter = new Lte(); break;
            default : adapter = null;
        }
        // 코코아톡 객체 생성
        cocoaTok = new CocoaTok("ff", adapter);

        // 메시지 작성 메서드 호출
        cocoaTok.writeMsg("안녕하세요");

        // 메시지 전송
        cocoaTok.send();
    }
}
