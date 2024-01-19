public class MilkTea extends Drink{
    private String teaLeaves;

    public MilkTea(String drinkName, int price) {
        super(drinkName, price);
    }

    public void setTeaLeaves(String teaLeaves) {
        this.teaLeaves = teaLeaves;
    }

    public MilkTea(String drinkName, int price, String teaLeaves, String cupSize, String hotOrIced, String extra) {
        super(drinkName, price, cupSize, hotOrIced, extra);
        this.teaLeaves = teaLeaves;
    }

    @Override
    public String printDetails() {
        return "찻잎 : " + teaLeaves + ", " + super.printDetails();
    }
}
