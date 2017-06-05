package org.fictio.shop.pojo;

public class GoodsPhotoRelation {
	
	private int id;
	private int goods_id;
	private String photo_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}
	public String getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(String photo_id) {
		this.photo_id = photo_id;
	}
	@Override
	public String toString() {
		return "GoodsPhotoRelation [id=" + id + ", goods_id=" + goods_id + ", photo_id=" + photo_id + "]";
	}
}
