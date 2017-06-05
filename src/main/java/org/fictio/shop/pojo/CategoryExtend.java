package org.fictio.shop.pojo;

public class CategoryExtend {
	
	private int goods_id;
	private int category_id;
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	@Override
	public String toString() {
		return "CategoryExtend [goods_id=" + goods_id + ", category_id=" + category_id + "]";
	}
}
