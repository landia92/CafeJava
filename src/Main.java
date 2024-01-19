import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Customer gillDong = new Customer("GillDong");   // 스탬프 기본값(0개)인 사용자
        Customer mammoth = new Customer("Mammoth", 11); //스탬프 11개인 사용자
        Order orderCoffee;
        System.out.println("방문 | 배달");
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();
        if(inputData.equals("방문")){ // 방문이면 CafeOrder
            orderCoffee = new CafeOrder();
            int exitCode = orderCoffee.order(mammoth);
            if (exitCode > 0) return;
        }
        else if(inputData.equals("배달")){    // 배달이면 DeliveryOrder
            orderCoffee = new DeliveryOrder();
            int exitCode = orderCoffee.order(mammoth);
            if (exitCode > 0) return;
        }
    }
}
