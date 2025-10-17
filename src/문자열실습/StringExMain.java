package 문자열실습;
// 실습문제 : Knuth-Morris-Pratt => KMP, Korea-Standard => KS,

public class StringExMain {
    public static void main(String[] args) {

        String sample = "Knuth-Morris-Pratt";
        sample = "Korea-Standard";

        // 실습문제 1 :
        // [1]대문자만 골라내는 방법, charAt()
        System.out.println("1번");
        for(int i = 0; i < sample.length(); i++){
            if(Character.isUpperCase(sample.charAt(i))) System.out.print(sample.charAt(i));
        }
        System.out.println();

        // [2]문자열의 0번째 인덱스 출력하고, '-'다음에 오는 문자 출력
        System.out.println("2번");
        System.out.print(sample.charAt(0));
        int charAt = -1;
        while (true) {
            charAt = sample.indexOf("-", charAt);
            if(charAt == -1) break;
            charAt++;
            System.out.print(sample.charAt(charAt));
        }
        System.out.println();

        // [3]"-" 기준으로 split으로 자르고, 0번째 인덱스 출력
        System.out.println("3번");
        String[] split = sample.split("-");
        for(String e : split) System.out.print(e.charAt(0));
        System.out.println();

        // [4]문자열을 문자 배열로 변경하고, 향상된 for문으로 순회하면서 해당 문자가 대문자 구간이면 출력
        System.out.println("4번");
        char[] charArr = sample.toCharArray();
        for(char e : charArr) {
            if (Character.isUpperCase(e)) System.out.print(e);
        }

        // 입력 받은 문자열에서 대문자는 소문자, 소문자는 대문자로 변환
        // AbCd => aBcD
        System.out.println();
        for(int i = 0; i < sample.length(); i++){
            if(Character.isUpperCase(sample.charAt(i)))
                System.out.print(Character.toLowerCase(sample.charAt(i)));
            else if(Character.isLowerCase(sample.charAt(i)))
                System.out.print(Character.toUpperCase(sample.charAt(i)));
            else System.out.print(sample.charAt(i));
        }

        // 입력 받은 문자열을 반대로 출력하기
        // ABCD => DCBA
        System.out.println();
        for(int i = sample.length()-1; i > -1; i--){
            System.out.print(sample.charAt(i));
        }
    }
}
