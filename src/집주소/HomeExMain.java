package 집주소;

import java.util.Scanner;

public class HomeExMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            int num = sc.nextInt();
            if (num == 0) break;
            char[] numChars = Integer.toString(num).toCharArray();
            int width = 0;
            for (char e : numChars) {
                switch (e) {
                    case '0': width += 4; break;
                    case '1': width += 2; break;
                    default: width += 3; break;
                }
            }
            width += numChars.length + 1;

            System.out.println(width);
        }
    }
}
