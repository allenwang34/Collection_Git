package com.allen.shopping;

public class GoodsInCart {
	private Goods goodsInCart;
	private int num;
	public GoodsInCart() {}
	public GoodsInCart(Goods goods, int num) {
		goodsInCart = goods;
		this.num = num;
	}
	public Goods getGoodsInCart() {
		return goodsInCart;
	}
	public void setGoodsInCart(Goods goodsInCart) {
		this.goodsInCart = goodsInCart;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
