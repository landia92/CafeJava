import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static final Map<String, Drink> menu = new HashMap<>();
    static{
        menu.put("아메리카노", new Coffee("아메리카노", 2000));
        menu.put("카페라떼", new Coffee("카페라떼", 2500));
        menu.put("카라멜마끼아또", new Coffee("카라멜마끼아또", 3000));
        menu.put("카페모카", new Coffee("카페모카", 3000));
        menu.put("카푸치노", new Coffee("카푸치노", 2500));
        menu.put("밀크티", new MilkTea("밀크티", 2500));
        menu.put("버블티", new MilkTea("버블티", 3500));
        menu.put("카페라떼(디카페인)", new DecaffeinatedCoffee("카페라떼(디카페인)", 2500));
        menu.put("카라멜마끼아또(디카페인)", new DecaffeinatedCoffee("카라멜마끼아또(디카페인)", 3000));
        menu.put("카페모카(디카페인)", new DecaffeinatedCoffee("카페모카(디카페인)", 3000));
        menu.put("카푸치노(디카페인)", new DecaffeinatedCoffee("카푸치노(디카페인)", 2500));
    }
}
