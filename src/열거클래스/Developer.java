package 열거클래스;

enum DevType {
    FRONTEND, BACKEND, FULLSTACK, MOBILE, AI
}
enum Career {
    JUNIOR, SENIOR
}
enum Gender {
    MALE, FEMALE
}

public class Developer {
    private String name;
    private DevType type;
    private Career career;
    private Gender gender;

    // 매개변수가 전부 있는 생성자 만들기

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }

    // 매개변수가 없는 생성자 만들기

    public Developer() {
        this.name = "아무개";
        this.type = DevType.MOBILE;
        this.career = Career.JUNIOR;
        this.gender = Gender.FEMALE;
    }

    // 각각의 정보를 설정하는 세터 메서드 만들기

    public void setName(String name) {
        this.name = name;
    }

    public void setType(DevType type) {
        this.type = type;
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // toString() 오버라이딩 해서 이름, 업무, 경력, 성별을 출력하기

    @Override
    public String toString() {
        return "=".repeat(7) + "개발자정보" + "=".repeat(7) + "\n" +
        "이름 : " + name + "\n" +
        "업무 : " + type + "\n" +
        "경력 : " + career + "\n" +
        "성별 : " + gender + "\n";
    }

}
