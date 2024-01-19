public class DecaffeinatedCoffee extends Coffee{
    public DecaffeinatedCoffee(String drinkName, int price) {
        super(drinkName, price);
    }

    public DecaffeinatedCoffee(String drinkName, int price, String beans, String cupSize, String hotOrIced, String extra) {
        super(drinkName, price, beans, cupSize, hotOrIced, extra);
    }
}
