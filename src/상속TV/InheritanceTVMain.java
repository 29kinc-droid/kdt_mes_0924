package 상속TV;

public class InheritanceTVMain {
    public static void main(String[] args) {
        ProductTV productTV1 = new ProductTV();
        ProductTV productTV2 = new ProductTV(true, 100, 400);
        ProductTV productTV3 = new ProductTV();
        productTV3.setChannel(true,800);

        System.out.println(productTV1);
        System.out.println(productTV2);
        System.out.println(productTV3);
    }
}
