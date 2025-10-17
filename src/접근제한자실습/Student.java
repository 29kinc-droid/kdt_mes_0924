package 접근제한자실습;

public class Student extends Person{
    private String school;

    public Student() {
        this.school = "덕천초등학교";
    }

    public String getSchool() {
        return this.school;
    }

    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("주소 : " + this.addr);
        System.out.println("학교 : " + this.school);
    }
}
