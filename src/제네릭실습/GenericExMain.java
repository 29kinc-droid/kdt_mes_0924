package 제네릭실습;

public class GenericExMain {
    public static void main(String[] args) {
        // <Powder> 타입을 제한함, 타입 변수 자리이기 때문에 참조 타입 아무거나 올 수 있지만, 지정된 타입만 받겠다는 의미
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);
        powderPrinter.getMaterial().doPrinting();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        plasticPrinter.setMaterial(new Plastic());
        System.out.println(plasticPrinter);
        plasticPrinter.getMaterial().doPrinting();

        GenericPrinter<Nylon> nylonPrinter = new GenericPrinter<>();
        nylonPrinter.setMaterial(new Nylon());
        System.out.println(nylonPrinter);
        nylonPrinter.getMaterial().doPrinting();

        GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        waterPrinter.setMaterial(new Water());
        System.out.println(waterPrinter);
        waterPrinter.getMaterial().doPrinting();

    }
}
