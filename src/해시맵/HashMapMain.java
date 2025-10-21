package 해시맵;
// Map key-value 쌍(Pair)으로 데이터를 저장하는 자료 구조
// key는 중복될 수 없고 값은 중복 가능
// List나 배열처럼 수차적인 접근을 하지 않고, key를 통해 value를 조회

import java.util.*;

// 기본 메뉴 3개 추가하는 메서드

// [1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료
public class HashMapMain {
    // final static Map 생성
    private final static Map<String, MenuMap> map = new HashMap<>();

    // final static Scanner 객체 생성
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        insertBasicMenu();

        // while(true)로 반복 수행하는 메뉴 작성
        while (true) {
            System.out.println("[1]전체 조회 [2]메뉴 검색 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료");
            try {
                switch (sc.nextInt()) {
                    case 1: viewAll(); break;
                    case 2: searchMenu(); break;
                    case 3: insertMenu(); break;
                    case 4: deleteMenu(); break;
                    case 5: editMenu(); break;
                    case 6: programExit();
                    default:
                        System.out.println("메뉴 범위 내에서 선택해주세요");
                }
            }catch (InputMismatchException e){
                System.out.println("정수를 입력해주세요.");
                sc.nextLine();
            }
        }

    }

    // 기본 메뉴 추가하는 메서드 작성
    // map.put("아메리카노", new MenuMap("아메리카노", 2000, "음료", "기본 커피");
    private static void insertBasicMenu(){
        map.put("아메리카노", new MenuMap("아메리카노", 2000, "음료", "기본 커피"));
        map.put("카페라떼", new MenuMap("카페라떼", 2500, "음료", "우유가 들어간 부드러운 커피"));
        map.put("바닐라라떼", new MenuMap("바닐라라떼", 2800, "음료", "바닐라 시럽이 들어간 달콤한 라떼"));
        map.put("딸기케이크", new MenuMap("딸기케이크", 3500, "디저트", "생딸기가 올라간 부드러운 케이크"));
        map.put("치즈베이글", new MenuMap("치즈베이글", 3000, "디저트", "고소한 치즈가 들어간 베이글"));
    }

    // 전체 메뉴 조회는 키값 기준으로 순회, for(String e : map.keySet())
    private static void viewAll(){
        for(String e : map.keySet()){
            System.out.println(map.get(e));
        }
    }

    // 메뉴 검색은 map.containsKey()
    private static void searchMenu() {
        System.out.println("검색할 메뉴 이름을 입력해주세요");
        String name = sc.next();
        if(map.containsKey(name)) System.out.println(map.get(name));
        else System.out.println("해당 메뉴가 없습니다");
    }

    // 새로운 키와 값을 추가 : map.put(키, 값)
    private static void insertMenu() {
        System.out.println("추가할 메뉴 이름을 입력해주세요");
        String name = sc.next();
        if(!map.containsKey(name)) {
            System.out.println("추가할 메뉴 가격을 입력해주세요");
            int price = sc.nextInt();
            System.out.println("추가할 메뉴 종류를 입력해주세요");
            String type = sc.next();
            System.out.println("추가할 메뉴 설명을 입력해주세요");
            sc.nextLine();
            String desc = sc.nextLine();
            map.put(name, new MenuMap(name, price, type, desc));
        }
        else System.out.println("해당 메뉴가 이미 존재합니다");
    }

    // 삭제 : map.remove(키)
    private static void deleteMenu() {
        System.out.println("삭제할 메뉴 이름을 입력해주세요");
        String name = sc.next();
        if(map.containsKey(name)) {
            map.remove(name);
            System.out.println("삭제되었습니다 (" + name + ")");
        }
        else System.out.println("해당 메뉴가 없습니다");
    }

    // 수정 : map.replace(키, 값)
    private static void editMenu() {
        System.out.println("수정할 메뉴 이름을 입력해주세요");
        String name = sc.next();
        if(map.containsKey(name)){
            MenuMap menuMap = map.get(name);
            System.out.println(menuMap);
            System.out.println("수정할 항목을 선택해주세요");
            System.out.println("[1]이름 [2]가격 [3]종류 [4]설명");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("수정할 메뉴 이름을 입력해주세요");
                    menuMap.setName(sc.next());
                    break;
                case 2:
                    System.out.println("수정할 메뉴 가격을 입력해주세요");
                    menuMap.setPrice(sc.nextInt());
                    break;
                case 3:
                    System.out.println("수정할 메뉴 종류를 입력해주세요");
                    menuMap.setType(sc.next());
                    break;
                case 4:
                    System.out.println("수정할 메뉴 설명을 입력해주세요");
                    sc.nextLine();
                    menuMap.setDesc(sc.nextLine());
                    break;
                default:
                    System.out.println("메뉴 범위 내에서 선택해주세요");
            }
        }
        else System.out.println("해당 메뉴가 없습니다");
    }

    // 종료
    private static void programExit() {
        System.out.println("프로그램을 종료합니다");
        System.exit(0);
    }

}
