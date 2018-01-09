package com.allen.shopping;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsManage GM = new GoodsManage();
		GM.importGoods();
		GM.displayAllGoods();
		GM.addItems(new Goods("G5","MacBook Air", 12888,"This is a MacBook"));
		System.out.println("*********************************");
		GM.displayAllGoods();
		System.out.println("*********************************");
		
		

	}
	
	

}
