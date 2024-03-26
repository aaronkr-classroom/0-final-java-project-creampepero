import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요: ");
		String name = input.next();

		System.out.print("연락처를 입력하세요: ");
		int phone = input.nextInt();
		
		// System.out.println("Welcome to Shopping Mall");
		// System.out.println("Welcome to Book Market!");
		
		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to BookMarket!!";
		
		boolean quit = false;
		while (!quit) {
			
			System.out.println("*********************************************");
			System.out.println("\t"+greeting);
			System.out.println("\t"+tagline);
			System.out.println("*********************************************");
			
			/* System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
			System.out.println("7. 영수증 표시하기 \t\t8. 종료");
			System.out.println("*********************************************"); */
			
			menuIntro();
			
			
			System.out.println("메뉴 번호를 선택해주세요.");
			int choice = input.nextInt();
			
			if ( choice  < 1 || choice > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요.");
			} else {
				switch(choice) {
				case 1:
//					System.out.println("1. 현재 고객 정보 : ");
//					System.out.println("이름" + userName + " 연락처 : " + userMobile);
					menuGuestInfo(name, phone);
					break;
				case 2:
					menuCartItemList();
					break;
				case 3:
					menuCartItemclear();
					break;
				case 4:
					menuCartAddItem();
					break;
				case 5:
					menuCartRemoveItemCount();
					break;
				case 6:
					menuCartRemoveItem();
					break;
				case 7:
					menuCartItemBill();
					break;
				case 8:
					menuCartItemExit();
					quit = true;
					break;
						
				} //switch 끝
				} //if-else 
				} // while 
		} //main 함수 끝
	
	/**
	 *  설명: Print Menu
	 *  매개변수: 
	 *  반환값:
	 *   
	 */
	public static void menuIntro () {
		System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
		System.out.println("2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
		System.out.println("3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
		System.out.println("7. 영수증 표시하기 \t\t8. 종료");
		System.out.println("*********************************************");
		}
	
	/**
	 *  설명: 고객님 정보 출력
	 *  매개변수: 
	 *  - String name 고객님의이름
	 *  - phone 고객님 전화번호
	 *  반환값:
	 *   
	 */
	
	public static void menuGuestInfo(String name, int phone) {
		System.out.println("1. 현재 고객 정보 : ");
		System.out.println("이름" + name + " 연락처 : " + phone);
	}
	/**
	 *  설명: 2번
	 *  매개변수: 
	 *  반환값:
	 *   
	 */
	public static void menuCartItemList() {
		System.out.println("2. 장바구니 상품 목록 보기 : ");
}
	public static void menuCartItemclear() {
		System.out.println("3. 장바구니 비우기");
}
	public static void menuCartAddItem() {
		System.out.println("4. 장바구니에 항목 추가하기 : ");
}
	public static void menuCartRemoveItemCount() {
		System.out.println("5. 장바구니의 항목 수량 줄이기");
}
	public static void menuCartRemoveItem() {
		System.out.println("6. 장바구니의 항목 삭제하기");
}
	public static void menuCartItemBill() {
		System.out.println("7. 영수증 표시하기");
	}
	public static void menuCartItemExit() {
		System.out.println("8. 종료");
}
	} //welcome class 끝
