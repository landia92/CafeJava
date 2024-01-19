import java.util.LinkedList;
import java.util.Scanner;

public class Order {
    private LinkedList<Drink> selectedDrink = new LinkedList<>();
    private int allPrice = 0;

    public LinkedList<Drink> getSelectedDrink() {
        return selectedDrink;
    }

    public int getAllPrice() {
        return allPrice;
    }

    public int order(Customer customer){
        for(Drink menu : Menu.menu.values()){   // 출력할 때 좀더 깔끔하게 출력하기 위해 for문 사용
            System.out.println(menu);
        }
        Scanner scanner = new Scanner(System.in);
        String inputData;
        System.out.println("\"종료\"를 입력하면 종료합니다");
        while (true){   // "종료"가 나올 때까지 반복
            System.out.println("메뉴를 입력하세요");
            while (true){
                inputData = scanner.nextLine();
                if(inputData.equals("종료")){ //종료
                    if(selectedDrink.isEmpty()){    // 주문 내역이 비어있으면 강제 종료를 해야함 System.exit(0); 대신 return으로 판단
                        System.out.println("종료합니다");
                        return 1;
                    }
                    System.out.println("주문자 : " + customer.getName());
                    System.out.println("주문내역");
                    for(Drink detail : selectedDrink){
                        System.out.println(detail.printDetails());
                    }
                    return 0;
                }
                else if(!Menu.menu.containsKey(inputData)){ // 미리 입력된 메뉴에 없으면 다시 입력
                    System.out.println("없는 메뉴입니다. 다시 입력하세요");
                }
                else {  // 선택한 메뉴에 세부사항을 추가하기 위함 | 선택한 메뉴를 저장
                    selectedDrink.add(Menu.menu.get(inputData));
                    break;
                }
            }
            if(selectedDrink.peekLast() instanceof MilkTea){    // 선택한 메뉴가 밀크티 종류일 때
                System.out.println("찻잎을 고르세요");
                inputData = scanner.nextLine();
                ((MilkTea) selectedDrink.peekLast()).setTeaLeaves(inputData);
            }
            else {
                System.out.println("원두을 고르세요");     // 선택한 메뉴가 커피류(일반/디카페인)일 때
                inputData = scanner.nextLine();
                ((Coffee) selectedDrink.peekLast()).setBeans(inputData);
            }
            System.out.println("Iced or Hot");  // 온도
            inputData = scanner.nextLine();
            selectedDrink.peekLast().setHotOrIced(inputData);
            System.out.println("컵 사이즈를 선택하세요"); //사이즈
            inputData = scanner.nextLine();
            selectedDrink.peekLast().setCupSize(inputData);
            System.out.println("추가사항이 있나요?");   //추가사항
            inputData = scanner.nextLine();
            selectedDrink.peekLast().setExtra(inputData);
            allPrice = allPrice + selectedDrink.peekLast().getPrice();  // 총 금액에 저장
        }
    }
}
