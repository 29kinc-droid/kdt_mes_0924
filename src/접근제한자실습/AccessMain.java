package 접근제한자실습;

public class AccessMain {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        student.showInfo();

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.addr);
        System.out.println(person.getSsn());

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.addr);
        System.out.println(student.getSsn());
        System.out.println(student.getSchool());




    }
}
