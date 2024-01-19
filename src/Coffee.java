public class Coffee extends Drink{
    private String beans;

    public Coffee(String drinkName, int price) {
        super(drinkName, price);
    }

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public Coffee(String drinkName, int price, String beans, String cupSize, String hotOrIced, String extra) {
        super(drinkName, price, cupSize, hotOrIced, extra);
        this.beans = beans;
    }

    @Override
    public String printDetails() {
        return "원두 : " + beans + ", " + super.printDetails();
    }
}
