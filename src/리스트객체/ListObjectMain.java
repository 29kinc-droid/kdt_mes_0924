package 리스트객체;

import java.awt.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ListObjectMain {
    public static void main(String[] args) {
        // ArrayList 생성
        List<MenuInfo> menuInfoList = new ArrayList<>();

        // 메뉴 객체 5개 추가하기
        menuInfoList.add(new MenuInfo("아메리카노", 2000, "음료", "기본 커피", true));
        menuInfoList.add(new MenuInfo("라떼", 4000, "음료", "우유 커피", true));
        menuInfoList.add(new MenuInfo("홍차", 4000, "차", "홍차 입니다.", false));
        menuInfoList.add(new MenuInfo("바게트", 5000, "빵", "빵 입니다.", true));
        menuInfoList.add(new MenuInfo("모카", 5000, "음료", "달달한 커피", true));

        Scanner sc = new Scanner(System.in);
        MenuInfo tmp;
        String menuName;

        while(true) {

            tmp = null;
            menuName = "";

            System.out.println("작업을 선택해주세요");
            System.out.println("[1] 전체 조회");
            System.out.println("[2] 메뉴 등록");
            System.out.println("[3] 메뉴 수정");
            System.out.println("[4] 메뉴 삭제");
            System.out.println("[5] 메뉴 검색");
            System.out.println("[6] 종료");

            try {
                switch (sc.nextInt()) {

                    // [1] 전체 조회
                    case 1:
                        for (MenuInfo e : menuInfoList) {
                            System.out.println(e);
                        }
                        break;

                    // [2] 메뉴 등록
                    case 2:
                        tmp = new MenuInfo();
                        System.out.print("이름 입력 : ");
                        tmp.setName(sc.next());
                        System.out.print("가격 입력 : ");
                        tmp.setPrice(sc.nextInt());
                        System.out.print("카테고리 입력 : ");
                        tmp.setCategory(sc.next());
                        System.out.print("설명 입력 : ");
                        tmp.setDesc(sc.next());
                        System.out.print("세금 포함 여부 (true/false) : ");
                        tmp.setTaxIncluded(sc.nextBoolean());
                        menuInfoList.add(tmp);
                        break;

                    // [3] 메뉴 수정
                    case 3:
                        System.out.print("수정할 메뉴 번호를 입력해주세요 : ");
                        try{
                            tmp = menuInfoList.get(sc.nextInt());
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("해당 메뉴가 없습니다");
                            continue;
                        }
                        System.out.println("수정할 메뉴의 항목을 선택해주세요 [1]이름 [2]가격 [3]카테고리 [4]설명 [5]세금 포함 여부");
                        switch (sc.nextInt()) {
                            case 1:
                                System.out.print("이름 입력 : ");
                                tmp.setName(sc.next());
                                break;
                            case 2:
                                System.out.print("가격 입력 : ");
                                tmp.setPrice(sc.nextInt());
                                break;
                            case 3:
                                System.out.print("카테고리 입력 : ");
                                tmp.setCategory(sc.next());
                                break;
                            case 4:
                                System.out.print("설명 입력 : ");
                                tmp.setDesc(sc.next());
                                break;
                            case 5:
                                System.out.print("세금 포함 여부 (true/false) : ");
                                tmp.setTaxIncluded(sc.nextBoolean());
                                break;
                            default:
                                System.out.println("메뉴 범위에 맞춰서 입력해주세요");
                                continue;
                        }
                        break;

                    // [4] 메뉴 삭제
                    case 4:
                        System.out.print("삭제할 메뉴 번호를 입력해주세요 : ");
                        menuInfoList.remove(sc.nextInt());
                        break;

                    // [5] 메뉴 검색
                    case 5:
                        System.out.print("검색할 메뉴 이름을 입력해주세요 : ");
                        menuName = sc.next();
                        for(MenuInfo e : menuInfoList) {
                            if(e.getName().equals(menuName)) {
                                tmp = e;
                                break;
                            }
                        }
                        if(tmp != null) System.out.println("메뉴 번호는 " + menuInfoList.indexOf(tmp) + "입니다");
                        else System.out.println("메뉴를 찾지 못했습니다");
                        break;

                    // [6] 종료
                    case 6:
                        System.out.println("프로그램을 종료합니다");
                        return;

                    default:
                        System.out.println("메뉴 범위에 맞춰서 입력해주세요");
                        continue;
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("입력 타입에 맞춰 입력해주세요");
                continue;
            }
        }
    }
}
