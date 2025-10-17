package 회원정보객체지향;

public class MemberMain {
    public static void main(String[] args) {
        // Member 클래스 타입의 잠조 변수에 멤버 객에 대입
        Member member = new Member();   // 클래스로 객체 생성
        member.setName();
        member.setAge();
        member.setGender();
        member.setJob();
        member.viewMember();
    }
}
