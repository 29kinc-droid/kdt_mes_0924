package 인터페이스리모콘;
// 인터페이스 : 클래스가 구현해야 할 메서드들의 설계명세
// - "이런 기능을 제공해야 한다"는 규칙 또는 약속을 정의
// - 이를 통해 다양한 클래스 동일한 기능을 일관된 형식으로 구현할 수 있음
// - 자바는 클래스의 다중 상속을 허용하지 않지만, 인터페이스는 다중 구현이 가능

// RemoteControl 인터페이스를 상속받아 Audio 클래스 생성
// RemoteControl 인터페이스를 상속받아 PS4 클래스 생성
// RemoteControl 인터페이스를 상속받아 Computer 클래스 생성


import java.util.Scanner;

public class RemoConMain {
    public static void main(String[] args) {

        // 제품을 선택하세요 [1]Audio [2]PS4 [3]Computer 기능을 추가해서 리모컨 기능을 동작 시키기

        Scanner sc = new Scanner(System.in);
        int pd, act = 0;
        RemoteControl[] rc = {new Audio(), new PS4(), new Computer()};

        while(true) {
            System.out.println("제품을 선택하세요 [1]Audio [2]PS4 [3]Computer");
            pd = sc.nextInt();
            if(pd >= 4 || pd <= 0) continue;
            System.out.println("동작을 선택하세요 [1]전원 켜기 [2]전원 끄기 [3]볼륨 설정");
            act = sc.nextInt();
            if(act >= 4 || act <= 0) continue;
            switch (act) {
                case 1 : rc[pd-1].turnOn(); break;
                case 2 : rc[pd-1].turnOff(); break;
                case 3 :
                    System.out.print("볼륨을 몇으로 설정할까요? ");
                    rc[pd-1].setVolume(sc.nextInt()); break;
            }

            RemoteControl carAudio = new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("Car Audio를 켭니다");
                }

                @Override
                public void turnOff() {
                    System.out.println("Car Audio를 끕니다");
                }

                private int volume;
                @Override
                public void setVolume(int volume) {
                    if(volume > RemoteControl.MAX_VOLUME) {
                        this.volume = RemoteControl.MAX_VOLUME;
                    } else if(volume < RemoteControl.MIN_VOLUME) {
                        this.volume = RemoteControl.MIN_VOLUME;
                    } else {
                        this.volume = volume;
                    }
                }
            };
            carAudio.turnOff();
            carAudio.turnOn();
            carAudio.setVolume(22);
        }
    }
}
