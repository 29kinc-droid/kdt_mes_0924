package 접근제한자실습;

public class Person {
    public String name;
    protected int age;
    String addr;
    private String ssn;

    public Person() {
        this.name = "퍼슨";
        this.age = 50;
        this.addr = "에이디디알";
        this.ssn = "에스에스엔";
    }

    public String getSsn() {
        return this.ssn;
    }
    // 인스턴스 필드에 대한 접근이 가능하도록 Getter 메서드 생성
}
