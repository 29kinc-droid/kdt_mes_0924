package TV만들기;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class TelevisionMain {
    public static void main(String[] args) {
        ArrayList<Television> televisionList = new ArrayList<Television>();
        televisionList.add(new Television(true, 35, 22));
        televisionList.add(new Television());
        televisionList.add(new Television(false));

        for (Television e : televisionList) {
            System.out.println(e);
        }


        IntBinaryOperator a;
        a = Integer::sum;
        Consumer<Integer> b;
        b = System.out::println;
        Function<int[], Integer> c;
        c = l -> {
            int sum = 0;
            for( int e : l) sum += e;
            return sum;
        };
        b.accept(a.applyAsInt(1,2));
        b.accept(c.apply(new int[]{3, 4, 5, 5, 2, 5, 2, 2}));


    }
}
