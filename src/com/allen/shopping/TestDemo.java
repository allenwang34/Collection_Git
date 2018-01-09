package com.allen.shopping;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
		boolean keepWorking = true;
		Scanner sc = new Scanner(System.in);
		GoodsManage GM = new GoodsManage();
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
	

}
