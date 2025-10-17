package BMI계산기;

import java.util.Scanner;

public class BMIMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("키(cm)를 입력하세요 : ");
        int h = sc.nextInt();
        System.out.println("몸무게(kg)를 입력하세요 : ");
        int w = sc.nextInt();
        double bmi = (double)w/((double)h * 0.01 * (double)h * 0.01);


        System.out.printf("당신의 BMI는 %.2f 입니다.\n", bmi);

        String status;
        if (bmi < 18.5) status = "저체중";
        else if (bmi < 23) status = "정상 체중";
        else if (bmi < 25) status = "과체중";
        else status = "비만";

        System.out.println(status + " 입니다.");
    }
}
