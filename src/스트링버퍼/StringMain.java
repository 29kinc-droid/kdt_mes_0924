package 스트링버퍼;
// StringBuffer, StringBuilder : 문자열을 추가하거나 변경할 때 사용하는 자료형
// StringBuffer는 멀티쓰레드 환경 지원
// StringBuilder는 멀티쓰레드 지원하지 않음

public class StringMain {
    public static void main(String[] args) {
        String text = "";
        text += "안녕하세요";
        text += "오늘은 ";
        text += "날씨가 흐려요.~~~~";
        System.out.println(text);

        StringBuilder sb = new StringBuilder();
        sb.append("안녕하세요.");
        sb.append("오늘은 ");
        sb.append("날씨가 흐려요.~~~");
        sb.insert(2, "hello");
        sb.delete(2,7); // 전달된 인덱스에 해당하는 문자열 제거
        System.out.println(sb);
    }
}
