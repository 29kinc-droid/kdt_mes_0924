package 다차원배열;

public class DoubleArrayMain {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int value = 0;
        for(int i = 0; i < arr.length; i++) {   // 행에 대한 길이
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ++value;
            }
        }
//        System.out.println(arr);        // 2차원 배열의 시작 주소
//        System.out.println(arr[0]);     // 2차원 배열의 0행의 시작 주소
//        System.out.println(arr[1]);     // 2차원 배열의 1행의 시작 주소
//        System.out.println(arr[0][0]);  // 2차원 배열의 0행의 0번째 열의 값

        // 범위기반 for 문으로 값을 출력하기
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // 향상된 for문으로 값 출력하기
        for (int[] rows : arr) {
            for (int e : rows) System.out.print(e + " ");
            System.out.println();
        }
    }
}
