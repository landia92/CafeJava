public class DeliveryOrder extends Order{
    private static final int DELIVERY_COST = 1000;  // 배달비
    @Override
    public int order(Customer customer){
        if(super.order(customer) > 0){  // 주문 내역이 비어있을 때
            return 1;
        }
        System.out.println("총 " + (getAllPrice()+DELIVERY_COST) + "원 입니다.");
        return 0;
    }
}
