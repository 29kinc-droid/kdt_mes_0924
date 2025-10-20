package 자바평가문제;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class JavaTestMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice1 = -1, choice2 = -1, choice3 = -1;
        List<Coffee> coffeeList = new ArrayList<>();

        while(true){

            Coffee coffee = new Coffee();

            System.out.println("생산할 커피 종류를 선택하세요");
            System.out.println("[1]에스프레소(2000원)");
            System.out.println("[2]아메리카노(1500원)");
            System.out.println("[3]카페라떼(1500원)");
            System.out.println("[4]카푸치노(2000원)");
            System.out.println("[5]생산제품 총 가격 보기");
            System.out.println("[6]처음으로");
            System.out.println("[7]종료");

            try{
                choice1 = sc.nextInt();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("정수값을 입력해주세요");
                continue;
            }
            if(choice1 < 1 || choice1 > 7){
                System.out.println("메뉴 중에서 선택해주세요");
                continue;
            }

            switch (choice1){
                case 1: coffee.setType(Coffee.CoffeeType.ESPRESSO); break;
                case 2: coffee.setType(Coffee.CoffeeType.AMERICANO); break;
                case 3: coffee.setType(Coffee.CoffeeType.LATTE); break;
                case 4: coffee.setType(Coffee.CoffeeType.CAPPUCCINO); break;
                case 5:
                    int totalPrice = 0;
                    for(Coffee e : coffeeList) {
                        totalPrice += e.calcPrice();
                    }
                    System.out.println("생산 제품들의 총 가격은 " + totalPrice + "원 입니다.");
                    continue;
                case 6: continue;
                case 7: return;
            }

            System.out.println("카페인/디카페인 중 선택하세요");
            System.out.println("[1]카페인(0원)");
            System.out.println("[2]디카페인(200원)");
            System.out.println("[3]처음으로");
            System.out.println("[4]종료");

            try{
                choice2 = sc.nextInt();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("정수값을 입력해주세요");
                continue;
            }
            if(choice2 < 1 || choice2 > 4){
                System.out.println("메뉴 중에서 선택해주세요");
                continue;
            }

            switch (choice2){
                case 1: coffee.setCaffeine(Coffee.CoffeeCaffeine.CAFFEIN); break;
                case 2: coffee.setCaffeine(Coffee.CoffeeCaffeine.DECAFFEIN); break;
                case 3: continue;
                case 4: return;
            }

            System.out.println("원두 원산지를 선택하세요");
            System.out.println("[1]예가체프(0원)");
            System.out.println("[2]콜롬비아(-200원)");
            System.out.println("[3]처음으로");
            System.out.println("[4]종료");

            try{
                choice3 = sc.nextInt();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("정수값을 입력해주세요");
                continue;
            }
            if(choice3 < 1 || choice3 > 4){
                System.out.println("메뉴 중에서 선택해주세요");
                continue;
            }

            switch (choice3){
                case 1: coffee.setOrigin(Coffee.CoffeeOrigin.YIRGACHEFFE); break;
                case 2: coffee.setOrigin(Coffee.CoffeeOrigin.COLOMBIA); break;
                case 3: continue;
                case 4: return;
            }

            System.out.println("다음을 선택하셨습니다");
            System.out.println(coffee.getType());
            System.out.println(coffee.getCaffeine());
            System.out.println(coffee.getOrigin());

            System.out.println("생산 완제품의 가격은 " + coffee.calcPrice() + "원 입니다.");

            coffeeList.add(coffee);
        }
    }
}
