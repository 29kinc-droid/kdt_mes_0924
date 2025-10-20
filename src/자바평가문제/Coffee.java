package 자바평가문제;

public class Coffee {
    public enum CoffeeType{
        ESPRESSO(2000),
        AMERICANO(1500),
        LATTE(1500),
        CAPPUCCINO(2000);

        private final int price;

        CoffeeType(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
    }

    public enum CoffeeCaffeine{
        CAFFEIN(0),
        DECAFFEIN(200);

        private final int price;

        CoffeeCaffeine(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
    }

    public enum CoffeeOrigin{
        YIRGACHEFFE(0),
        COLOMBIA(-200);

        private final int price;

        CoffeeOrigin(int price) {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }
    }
    private CoffeeType type;
    private CoffeeCaffeine caffeine;
    private CoffeeOrigin origin;

    public Coffee() {
        type = CoffeeType.ESPRESSO;
        caffeine = CoffeeCaffeine.CAFFEIN;
        origin = CoffeeOrigin.YIRGACHEFFE;
    }

    public String getType() {
        return type.name();
    }

    public void setType(CoffeeType type) {
        this.type = type;
    }

    public String getCaffeine() {
        return caffeine.name();
    }

    public void setCaffeine(CoffeeCaffeine caffeine) {
        this.caffeine = caffeine;
    }

    public String getOrigin() {
        return origin.name();
    }

    public void setOrigin(CoffeeOrigin origin) {
        this.origin = origin;
    }

    public int calcPrice(){
        return type.getPrice() + caffeine.getPrice() + origin.getPrice();
    }
}


