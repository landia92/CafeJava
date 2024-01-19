public class Drink {
    private String drinkName;
    private int price;
    private String cupSize;
    private String hotOrIced;
    private String extra;

    public Drink(String drinkName, int price) {
        this.drinkName = drinkName;
        this.price = price;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setHotOrIced(String hotOrIced) {
        this.hotOrIced = hotOrIced;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    public int getPrice(){
        return price;
    }

    public Drink(String drinkName, int price, String cupSize, String hotOrIced, String extra) {
        this.drinkName = drinkName;
        this.price = price;
        this.cupSize = cupSize;
        this.hotOrIced = hotOrIced;
        this.extra = extra;
    }

    @Override
    public String toString() { 
        return "메뉴명 : " + drinkName + ", "+
                "가격 : " + price;
    }

    public String printDetails() {  //주문 내역 출력시 사용
        return "메뉴명 : " + drinkName + ", "+
                "가격 : " + price + ", "+
                "사이즈 : " + cupSize + ", "+
                "온도 : " + hotOrIced + ", "+
                "추가사항 : " + extra + ", ";
    }

}
