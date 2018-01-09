package com.allen.shopping;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
	private Set<Goods> goodsSet;
	
	public GoodsManage() {
		goodsSet = new HashSet<Goods> ();
	}
	
	public Set<Goods> getGoodsSet() {
		return goodsSet;
	}

	public void setGoodsSet(Set<Goods> goodsSet) {
		this.goodsSet = goodsSet;
	}

	public void addItems(Goods goods) {
		goodsSet.add(goods);
	}
	
	public Goods getItem(String goodsName) throws NullPointerException {
		Iterator<Goods> it = goodsSet.iterator();
		while (it.hasNext()) {
			Goods temp = it.next();
			if (temp.getGoodsName()==goodsName) {
				return temp;
			}
		}
		return null;
	}
	
	public void importGoods() {
		goodsSet.add(new Goods("G1","iPhone",6888,"This is an iPhone."));
		goodsSet.add(new Goods("G2","iPad",8888,"This is an iPad."));
		goodsSet.add(new Goods("G3","MacBook",16888,"This is a MacBook."));
		goodsSet.add(new Goods("G4","MacBook Pro",18888,"This is a MacBook Pro."));
	}
	
	public void displayAllGoods() {
		Iterator<Goods> it = goodsSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
