import java.util.Scanner;

public class CafeOrder extends Order{
    private static final int STAMP_DISCOUNT = 1000; // 할인비
    public int order(Customer customer) {
        if(super.order(customer) > 0){  // 주문 내역이 비어있을 때
            return 1;
        }
        System.out.println("스탬프 " + customer.getMyStamp().getStamp() + "개");
        System.out.println("스탬프를 사용 하시겠습니까?");
        Scanner scanner = new Scanner(System.in);
        String inputData = scanner.nextLine();

        if(inputData.equals("예")){
            if(customer.getMyStamp().getStamp()<Stamp.USE_STAMP){
                System.out.println("스탬프의 개수가 부족합니다. 스탭프를 적립합니다.");
                customer.getMyStamp().addStamp();
                System.out.println("총 " + getAllPrice() + "원 입니다.");
            }
            else {
                customer.getMyStamp().useStamp();
                System.out.println("총 " + (getAllPrice()-STAMP_DISCOUNT) + "원 입니다.");
            }
        }
        else {
            customer.getMyStamp().addStamp();
            System.out.println("총 " + getAllPrice() + "원 입니다.");
        }
        return 0;
    }

}
