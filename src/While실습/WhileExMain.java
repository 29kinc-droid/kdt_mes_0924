package While실습;

// 두 개의 주사위를 던져 같은 수가 나오면 값을 보여주고 무인도 탈출
// Math.random() : 0 ~ 1 미만의 무작위 실수값 생성, 0.0001 ~ 0.9999
// int val = (int) (Math.random() * 6) + 1
public class WhileExMain {
    public static void main(String[] args) {
        int dice1, dice2, count = 0;
        while(true) {
            dice1 = 1 + (int)(Math.random() * 6);
            dice2 = 1 + (int)(Math.random() * 6);
            count ++;
            if(dice1 == dice2) break;
        }
        System.out.println("주사위 " + dice1 + ", " + dice2 + "으로 " + count + "회 만에 탈출에 성공했습니다. ");
    }
}
