package 다운캐스팅;
// 업캐스팅 : 자연스러운 방향이기 때문에 형 병환이 필요없음 (부모 클래스의 참조 변수로 자식 객체를 바라보는것)
// 다운캐스팅 : 업캐스팅 되었던 객체를 원래 자식 타입으로 되돌리는것
// instanceof : 객체가 특정 클래스의 인스턴스(객체)인지 확인하는

import java.util.ArrayList;
import java.util.List;

public class CastMain {
    List<Animal> list = new ArrayList<>();  // 배열과 유사하지만 훨씬 효율적인 리스트 사용
    public static void main(String[] args) {
        CastMain castMain = new CastMain();
        castMain.addAnimal();
        castMain.downCast();
    }
    public  void addAnimal() {
        list.add(new Animal());
        list.add(new Human());
        list.add(new Tiger());
        list.add(new Eagle());

        for (Animal ani : list) {
            ani.move();
        }
    }
    public void downCast() {
        for (Animal animal : list) {
            // Human
            if (animal instanceof Human h) {  // 객체와 클래스의 타입이 일치하는지 확인
                h.readBook();
            }
            // Tiger
            else if (animal instanceof Tiger t) {
                t.hunting();
            }
            // Eagle
            else if (animal instanceof Eagle e) {
                e.flying();
            }
            // else에 대한 예외 처리
            else System.out.println("지원되지 않는 형 입니다.");
        }
    }
}
