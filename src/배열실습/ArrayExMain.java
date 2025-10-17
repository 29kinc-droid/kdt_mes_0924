package 배열실습;

import java.util.Scanner;

// 평균점수 구하기
// 수강생이 5명, 각 학생의 점수 40점 미만이면 보충학습을 듣는 조건으로 40점으로 변경
// 55, 65, 30, 45, 25 => 55, 65, 40, 45, 40
public class ArrayExMain {
    public static void main(String[] args) {
//        // 스캐너 객체 생성
//        Scanner sc = new Scanner(System.in);
//        // 5명의 성적을 입력받기 (배열)
//        int[] scores = new int[5];
//        System.out.println("5명의 성적을 입력받습니다.");
//        for(int i = 0; i < scores.length; i++) scores[i] = sc.nextInt();
//        // 40점 미만의 성적은 40점으로 변경해서 평균 구하기
//        int total = 0;
//        float avg = 0;
//        for(int e : scores) {
//            if (e < 40) e = 40;
//            total += e;
//        }
//        avg = (float)total/scores.length;
//        System.out.println("평균은 " + (int)avg + "입니다.");

        // 실습 문제 2번
        // 7자리의 로또 번호 생성하기 (배열과 Math.random() 사용), 1 ~ 45 사이의 임의의 수 7개를 생성해 배열에 저장하기

        int[] lotto = new int[7];
        int[] pool = new int[45];
        for(int i = 0; i < pool.length; i++){
            pool[i] = i;
        }
        int r = 0;
        for(int i = 0; i < lotto.length; i++){
            r = (int)(Math.random() * (45-i));
            lotto[i] = pool[r];
            pool[r] = pool[pool.length-1-i];
        }
        for(int e : lotto){
            System.out.printf("%2d ", e);
        }
    }
}
