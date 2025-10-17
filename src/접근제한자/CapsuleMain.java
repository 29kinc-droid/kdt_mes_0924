package 접근제한자;

import 자판기만들기.Parent;

public class CapsuleMain {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getName());
        System.out.println(child.getMoney());
        System.out.println(child.getAddr());
    }
}

class Child extends Parent {
    public String getName() {
        return this.name;
    }
    public String getMoney() {
        return this.money;
    }
    public String getAddr() {
        return this.addr;
    }
}