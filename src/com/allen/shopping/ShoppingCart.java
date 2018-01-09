package com.allen.shopping;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;

public class ShoppingCart {
	private Map<String,GoodsInCart> shoppingCart;
	public ShoppingCart() {
		shoppingCart = new HashMap<String,GoodsInCart>();
	}
	public void addGoodsToCart(GoodsManage gm) throws NullPointerException {
		gm.displayAllGoods();
		System.out.println("************************************************************************");
		System.out.println("Input the item ID you want to add into shopping cart: ");
		Scanner sc = new Scanner(System.in);
		String itemID = sc.next();
		System.out.println("************************************************************************");
		System.out.println("Please input the numer of item you want to add: ");
		int num = sc.nextInt();
		Set<Goods> gmSet= gm.getGoodsSet();
		Goods tempGoods = null;
		for (Goods goods : gmSet) {
			if (goods.getGoodsId().equals(itemID)) {
				tempGoods = goods;
				if (shoppingCart.containsKey(itemID)) {
					GoodsInCart updatedGoodsInCart = shoppingCart.get(itemID);
					updatedGoodsInCart.setNum(updatedGoodsInCart.getNum()+num);
					shoppingCart.put(itemID, updatedGoodsInCart);
					break;
				}
				else {
					GoodsInCart addedGoods = new GoodsInCart(goods,num);
					shoppingCart.put(goods.getGoodsId(), addedGoods);
					break;
				}
			}
		}
		System.out.println("************************************************************************");
		System.out.println("Item: " + tempGoods.getGoodsName() + " has been added to your shopping cart!");
		
	}
	
	public Map<String, GoodsInCart> getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(Map<String, GoodsInCart> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public void updateNumInCart() {
		System.out.println("************************************************************************");
		System.out.println("Give me the item ID: ");
		Scanner sc = new Scanner(System.in);
		String itemID = sc.next();
		if (shoppingCart.containsKey(itemID)) {
			System.out.println("************************************************************************");
			System.out.println("How many items you want to change?");
			int itemNum = sc.nextInt();
			shoppingCart.get(itemID).setNum(itemNum);
			System.out.println("************************************************************************");
			System.out.println(itemNum + " items have been updated!");
		}
		else {
			System.out.println("************************************************************************");
			System.out.println("Please add the item to the shopping cart first!");
		}
	}
	
	public void displayAllInCart() {
		System.out.println("************************************************************************");
		System.out.println("Items in cart: ");
		Iterator<GoodsInCart> it = shoppingCart.values().iterator();
		while(it.hasNext()) {
			GoodsInCart temp = it.next();
			System.out.println(temp.getGoodsInCart()+ " Amount: " + temp.getNum());
		}
	}
	
	public void settleAccounts() {
		double totalPrice = 0.0;
		Iterator<GoodsInCart> it = shoppingCart.values().iterator();
		while(it.hasNext()) {
			GoodsInCart temp = it.next();
			double objPrice = temp.getNum() * temp.getGoodsInCart().getPrice();
			totalPrice += objPrice;
		}
		System.out.println("The Total Price In Your Shopping Cart Is: $" + totalPrice);
	}
	

}
