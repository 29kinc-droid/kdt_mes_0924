package 문자열;
// 문자열 : string, 참조 타입의 자료형
// 문자열 표현을 위해서, 객체를 만들거나, 리터럴 표기 방식으로 사용 (대부분의 경우 리터럴 표기 방식을 사용)

public class StringMain {
    public static void main(String[] args) {
//        String text = "안녕하세요. 자바 문자열 입니다";
//        String text1 = new String("Hello Java");    // 권장되지 않는 방식

        // equals(), equalsIgnoreCase()
        // equals : 두개의 문자열이 동일한지 비교하여 결과 값을 리턴 (오버라이딩 됨)
        String text1 = "hello";
        String text2 = "java";
        String text3 = "HELLO";
        System.out.println(text1.equals(text2));    // 문자열 내용이 같은지 비교
        System.out.println(text1.equalsIgnoreCase(text3));

        // indexOf() : 문자열에서 부분 문자열이 시작되는 인덱스 변환
        String text4 = "안녕하세요. 자바 자바 자바입니다. 오늘도 화이팅!!!!!";
        System.out.println(text4.indexOf("자바다"));   // 찾지 못하면 -1

        // contains() : 문자열에서 부분 문자열이 포함되어 있는지를 리턴
        System.out.println(text4.contains("오늘도"));

        // charAt() : 문자열에서 특정 문자를 반환
        System.out.println(text4.charAt(3));

        // replace() : 문자열에서 부분 문자열을 다른 문자열로 대체하거나 지울 때 사용
        String text5 = text4.replace("자바", "파이썬");
        System.out.println(text5);
        // replaceAll() : 정규표현식을 사용
        String text6 = text4.replaceAll("자바", "파이썬");
        System.out.println(text5);

        // subString() : 문자열에서 부분 문자열 추출에 사용
        String text7 = "안녕하세요.자바파이썬자바스크립트입니다.";
        System.out.println(text7.substring(5)); // 5번 인덱스부터 끝까지
        System.out.println(text7.substring(5, 10)); // 5번 인덱스부터 10번 인덱스 미만까지

        // toUpperCase(), toLowerCase() : 문자열을 전부 대문자, 전부 소문자로 변경
        String text8 = "Hello JavaScript, Python";
        System.out.println(text8.toUpperCase());
        System.out.println(text8.toLowerCase());

        // trim() : 문자열 앞뒤의 공백을 잘라냅니다.
        String text9 = "            자바   프로그래밍          ";
        System.out.println(text9.trim());

        // split() : 문자열을 특정 구분자 기준으로 자름
        String timeFormat = "23:45:59";
        String[] strArr = timeFormat.split(":");    // ":" 기준으로 잘라서 부분 문자열로 만듬
        System.out.println(strArr[0] + "시" + strArr[1] + "분" + strArr[2] + "초");

        // 문자열 포매팅 : 문자열 내에 어떤 값을 삽입하는것, printf()문과 거의 유사함
        String convertStr = String.format("안녕하세요. 저는 밥을 하루에 %d번 먹어요.", 3);
        System.out.println(convertStr);

        // toCharArray() : 문자열을 문자 배열로 변환
        String text10 = "안녕하세요. 날씨가 좋아요. 가을이네요.~~~";
        char[] charText = text10.toCharArray();
        for (char e : charText) System.out.print(e + "/");
    }
}
