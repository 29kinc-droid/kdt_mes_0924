package 해시맵;
// 메뉴이름, 가격, 분류, 설명
// 매개변수가 전부 있는 생성자 추가
// 게터, 세터 추가
// toString 오버라이딩
public class MenuMap {
    private String name;
    private int price;
    private String type;
    private String desc;

    public MenuMap(String name, int price, String type, String desc) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString(){
        return "=".repeat(15)
                + "\n" + "이름 : " + name
                + "\n" + "가격 : " + price
                + "\n" + "분류 : " + type
                + "\n" + "설명 : " + desc;
    }
}
