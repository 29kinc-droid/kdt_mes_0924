package 동적다형성응용;

public class Driver {
    String name;
    Driver(String name) {
        this.name = name;
    }
    void drive(Vehicle v) {
        System.out.print(name + "의 ");
        v.run();
    }
}
