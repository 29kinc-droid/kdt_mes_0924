package 객체지향기본;
// email
// pwd
// 이름
// 주소
// 전화번호

public class MemberInfo {
    private String email;   // 인스턴스 필드, 객체 생성 시 함께 만들어짐
    private String pwd;
    private String name;
    private String addr;
    private String phone;

    // 생성자는 객체 생성 시 자동으로 호출되고, 만들지 않으면 기본 생성자가 숨어있음
    // 생성자는 클래스 이름과 동일하고, 반환 타입 자체가 없음
    // 생성자는 인스턴스에 초기값 부여 용도로 사용됨
    public MemberInfo(String email, String pwd, String name, String addr, String phone) {
        this.email = email;
        this.pwd = pwd;
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    // 필드값을 읽기 위한 Getter 메서드, 반환값이 String
    public String getEmail() {
        return email;
    }

    // 필드에 값을 쓰기 위한 Setter 메서드, 매개변수로 전달받아 필드에 값을 대입
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return email + ", " + pwd + ", " + name + ", " + addr + ", " + phone;
    }
}
