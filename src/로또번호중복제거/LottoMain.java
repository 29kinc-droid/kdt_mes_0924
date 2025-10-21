package 로또번호중복제거;
// 1 ~ 45 사이의 임의의 수 6개 생성 (중복되면 안됨)

import java.util.*;

public class LottoMain {

    public static void main(String[] args) {

        // 1. List를 사용해 중복 제거 해보기
        List<Integer> lottoList = new ArrayList<>();
        while (true) {
            int num = 1 + (int)(Math.random() * 45);
            if (!lottoList.contains(num)) {
                lottoList.add(num); // contains로 확인하고 중복이 아닐때만 add
            }
            else System.out.println("중복발견");
            if (lottoList.size() >= 6) break;
        }
        System.out.println(lottoList);

        // 2. Set을 사용해 중복 제거 해보기
        Set<Integer> lottoSet = new HashSet<>();
        while (true) {
            int num = 1 + (int)(Math.random() * 45);
            if (lottoSet.contains(num)) System.out.println("중복발견");
            lottoSet.add(num);  // contains 확인 결과와 상관없이 add하면 자동으로 중복값을 제거함
            if (lottoSet.size() >= 6) break;
        }
        System.out.println(lottoSet);
    }
}
