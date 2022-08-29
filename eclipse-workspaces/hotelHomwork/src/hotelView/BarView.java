package hotelView;

import java.util.Scanner;

import hotelVo.Bar;

public class BarView {
	Scanner sc;

	public BarView() {
		super();
		sc = new Scanner(System.in);
	}

	public int barSel() {
		System.out.println("1.물품판매");
		System.out.println("2.재고추가");
		System.out.println("3.재고확인");
		System.out.println("0.종료");
		System.out.print("선택 > ");
		int barSel = sc.nextInt();

		return barSel;
	}

	public int[] barMenu(Bar[] bar) {
		System.out.println("============ 판매 물품 ============");
		System.out.printf("%s\t%s\t\t%s\n","번호","품명","가격");
		System.out.println("=================================");
		for (int i = 0; i < bar.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n",(i+1),bar[i].getProductName(),bar[i].getPrice());
		}

		System.out.print("구매하실 물품의 번호를 입력해주세요 > ");
		int pSel1 = sc.nextInt();
		
			
		System.out.print("구매하실 수량을 입력해주세요 > ");
		int pSel2 = sc.nextInt();
		if(pSel2 <= bar[pSel1-1].getQuantity()) {

		System.out.println("구매한 물건 : "+ bar[pSel1-1].getProductName());
		System.out.println("구매한 수량 : "+ pSel2);
		System.out.println("결제금액 : "+(bar[pSel1-1].getPrice()*pSel2)+"원 입니다.");
		} else {
			System.out.println("재고가 부족합니다.");
		}
		

		int[] pSel = new int[2];
		pSel[0] = pSel1;
		pSel[1] = pSel2;

		return pSel;
	}// barMenu종료 

	public int[] amountAdd(Bar[] bar) {
		System.out.println("============ 재고 추가 ============");
		System.out.printf("%s\t%s\t\t%s\n","번호","품명","수량");
		System.out.println("=================================");
		for (int i = 0; i < bar.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n",(i+1),bar[i].getProductName(),bar[i].getQuantity());
		}
		System.out.print("재고를 추가하실 물품의 번호를 입력해주세요 > ");
		int pSel1 = sc.nextInt();
		System.out.print("재고를 추가하실 수량을 입력해주세요 > ");
		int pSel2 = sc.nextInt();

		System.out.println("재고추가 물건 : "+ bar[pSel1-1].getProductName());
		System.out.println("재고추가 수량 : "+ pSel2);
		
		int[] pSel = new int[2];
		pSel[0] = pSel1;
		pSel[1] = pSel2;

		return pSel;
	}
	public void amountCheck(Bar[] bar) {
		System.out.println("========== 재고 확인 ==========");
		System.out.printf("%s\t%s\t\t%s\n","번호","품명","수량");
		for (int i = 0; i < bar.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n",(i+1),bar[i].getProductName(),bar[i].getQuantity());
		}
	}
	
	public int barEmpMenu() {
		System.out.println("1. 재고확인");
		System.out.println("2. 재고추가");
		System.out.print("선택 > ");
		
		int barMenuSel = sc.nextInt();
		
		return barMenuSel;
	}
	
	
} //클래스 종료
