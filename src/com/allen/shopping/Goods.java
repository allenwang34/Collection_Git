package com.allen.shopping;

public class Goods {
	private String goodsId;
	private String goodsName;
	private double price;
	private String goodsDesp;
	public Goods(String goodsId, String goodsName, double price, String goodsDesp) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.price = price;
		this.goodsDesp = goodsDesp;
	}
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getGoodsDesp() {
		return goodsDesp;
	}
	public void setGoodsDesp(String goodsDesp) {
		this.goodsDesp = goodsDesp;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((goodsDesp == null) ? 0 : goodsDesp.hashCode());
		result = prime * result + ((goodsId == null) ? 0 : goodsId.hashCode());
		result = prime * result + ((goodsName == null) ? 0 : goodsName.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj.getClass()==Goods.class) {
			Goods goods = (Goods) obj;
			return goods.getGoodsId().equals(this.goodsId) && goods.getGoodsName().equals(this.goodsName) && goods.getPrice()==this.price && goods.getGoodsDesp().equals(this.goodsDesp);
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "商品信息[编号：" + goodsId + "，名称：" + goodsName + "，价格：" + price + "，描述：" + goodsDesp + "]";
	}
}
