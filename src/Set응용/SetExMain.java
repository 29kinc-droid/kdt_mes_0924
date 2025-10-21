package Set응용;

import java.util.HashSet;
import java.util.Set;

public class SetExMain {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        set.add(new Member(1000, "카리나"));
        set.add(new Member(1001, "윈터"));
        set.add(new Member(1003, "밍밍"));
        set.add(new Member(1004, "지젤"));
        set.add(new Member(1004, "지수"));

        for(Member e : set) {
            System.out.println(e.hashCode());
        }
    }
}

class Member {
    int id;
    String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {
            return this.id == member.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "아이디 : " + id + "\n" +
                "이름 : " + name + "\n";
    }
}
