package 리스트객체;
// 이름, String
// 가격, int
// 카테고리, String
// 설명, String
// 세금 포함 여부, boolean

// 매개변수가 전부 있는 생성자
// toString 오버라이딩해서 정보 출력하기

public class MenuInfo {
    private String name;
    private int price;
    private String category;
    private String desc;
    private boolean isTaxIncluded;

    public MenuInfo(String name, int price, String category, String desc, boolean isTaxIncluded) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTaxIncluded = isTaxIncluded;
    }

    public MenuInfo() {
        this.name = "";
        this.price = 0;
        this.category = "";
        this.desc = "";
        this.isTaxIncluded = false;
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
        if(price > 0) this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isTaxIncluded() {
        return isTaxIncluded;
    }

    public void setTaxIncluded(boolean taxIncluded) {
        isTaxIncluded = taxIncluded;
    }

    @Override
    public String toString() {
        return "-".repeat(15) + "\n"
                + "이름 : " + name + "\n"
                + "가격 : " + price + "\n"
                + "카테고리 : " + category + "\n"
                + "설명: " + desc + "\n"
                + "세금 포함 여부 : " + (isTaxIncluded?"예":"아니오") + "\n"
                + "-".repeat(15);
    }
}
