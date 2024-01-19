import java.util.Scanner;

public class Customer {
    private String name;
    private Stamp myStamp = new Stamp();

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, int stampNum) {
        this.name = name;
        myStamp.setStamp(stampNum);
    }

    public String getName() {
        return name;
    }

    public Stamp getMyStamp() {
        return myStamp;
    }
}
