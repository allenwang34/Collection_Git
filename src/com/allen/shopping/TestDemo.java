package com.allen.shopping;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
		boolean keepWorking = true;
		Scanner sc = new Scanner(System.in);
		GoodsManage GM = new GoodsManage();
		ShoppingCart SC = new ShoppingCart();
		do {
			displayMainMenu();
			System.out.println("************************************************************************");
			System.out.println("Please give me an input: ");
			int userInput = sc.nextInt();
			switch(userInput) {
			
			
				case 1 : 
					boolean keepGMMenu = true;
					do {
						displayGMMenu();
						System.out.println("************************************************************************");
						System.out.println("Please give me an input: ");
						int GMInput = sc.nextInt();
						switch (GMInput) {
							case 9: 
								keepGMMenu=false;
								break;
							case 1:
								GM.importGoods();
								System.out.println("************************************************************************");
								System.out.println("Goods input finished");
								break;
							case 2: 
								System.out.println("************************************************************************");
								GM.displayAllGoods();
						}
					} while (keepGMMenu);
					break;
					
					
				case 2: 
					
					boolean keepSCMenu = true;
					do {
						displaySCMenu();
						System.out.println("************************************************************************");
						System.out.println("Please give me an input: ");
						int SCInput = sc.nextInt();
						switch(SCInput) {
							case 1:
								try {
								SC.addGoodsToCart(GM);
								break;
								}
								catch (NullPointerException e){
									System.out.println("************************************************************************");
									System.out.println("Error Occur!");
								
									break;
								}
							case 2: 
								SC.updateNumInCart();
								break;
							case 3:
								SC.displayAllInCart();
								break;
							case 9:
								keepSCMenu = false;
								break;
									
						}
						
							
					} while(keepSCMenu);
					break;
					
					
					
				case 0:
					keepWorking=false;
					break;
					
			
			}
		}while(keepWorking);
		System.out.println("************************************************************************");
		System.out.println("                            **END**                                     ");
		
	}
	
	public static void displayMainMenu() {
		System.out.println("************************************************************************");
		System.out.println("                            **Main Menu**                               ");
		System.out.println("                       1--Goods Management                              ");
		System.out.println("                       2--Shopping Cart                                 ");
		System.out.println("                       0--Exit                                          ");
		
	}
	
	public static void displayGMMenu() {
		System.out.println("************************************************************************");
		System.out.println("                            **Goods Management**                        ");
		System.out.println("                       1--Goods Info Input                              ");
		System.out.println("                       2--Display All Goods Info                        ");
		System.out.println("                       9--Back To Previous Menu                         ");
		
	}
	
	public static void displaySCMenu() {
		System.out.println("************************************************************************");
		System.out.println("                            **Shopping Cart**                           ");
		System.out.println("                       1--Add Goods To Shopping Cart                    ");
		System.out.println("                       2--Change Number Of Goods                        ");
		System.out.println("                       3--Display Goods In Shopping Cart                ");
		System.out.println("                       4--Check Out                                     ");
		System.out.println("                       9--Back To Previous Menu                         ");
	}
	

}
