package 배열;
// 배열이란? 동일한 타입의 데이터 요소들을 연속으로 저장하는 자료구조
// 배열은 여러개의 값을 하나의 변수에 저장할 수 있도록 해줌, 인덱스를 사용하여 각 요소에 접근
// 자바에서는 기본 자료형과 객체 타입 모두에 대해서 사용할 수 있음
// 자바 배열은 객체로 취급되며, 기본적으로 Heap 영역에 메모리가 할당, 크기를 지정해서 사용
public class ArrayMain {
    public static void main(String[] args) {
//        // 정수형 배열을 선언, arr은 배열에 대한 참조 타입 변수, 힙 영역에 정수 5개 크기의 메모리 확보
//        int[] arr = new int[5];
//        arr[0] = 100;
//        arr[1] = 200;
//        arr[2] = 300;
//        arr[3] = 400;
//        arr[4] = 500;
//        arr[5] = 600;
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        // 스택 영역에 값이 저장됨
        int[] scores = {100, 200, 400, 500, 600, 700};
        // 향상된 for문을 사용해 값을 누적해보기
        int total = 0;
        for(int e : scores) {
            e += 100;   // e = e + 100, e 값은 배열의 실제 값이 아니고 복사된 값임
        }
        for(int e : scores) {
            total += e;
        }
        System.out.println("배열의 합계 : " + total);
    }
}
