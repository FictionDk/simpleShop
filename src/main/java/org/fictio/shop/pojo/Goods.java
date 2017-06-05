package org.fictio.shop.pojo;
import java.sql.Timestamp;

public class Goods {
	private int id;
	private String name;
	private String goods_no;
	private int model_id;
	private double market_price;
	private double sell_price;
	private double cost_price;
	private Timestamp up_time;
	private Timestamp down_time = null;
	private Timestamp create_time;
	private int store_nums;
	private String img;
	private String ad_img;
	private int is_del;
	private String content;
	private String keywords;
	private String search_words;
	private String description;
	private double weight;
	private int point;
	private String unit;
	private int brand_id;
	private int visit;
	private int favorite;
	private String sort;
	private String spec_array;
	private int exp;
	private int comments;
	private int sale;
	private int grade;
	private int seller_id;
	private int is_share;
	private int ordered_nums;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoods_no() {
		return goods_no;
	}
	public void setGoods_no(String goods_no) {
		this.goods_no = goods_no;
	}
	public int getModel_id() {
		return model_id;
	}
	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}
	public double getMarket_price() {
		return market_price;
	}
	public void setMarket_price(double market_price) {
		this.market_price = market_price;
	}
	public double getSell_price() {
		return sell_price;
	}
	public void setSell_price(double sell_price) {
		this.sell_price = sell_price;
	}
	public double getCost_price() {
		return cost_price;
	}
	public void setCost_price(double cost_price) {
		this.cost_price = cost_price;
	}
	public Timestamp getUp_time() {
		return up_time;
	}
	public void setUp_time(Timestamp up_time) {
		this.up_time = up_time;
	}
	public Timestamp getDown_time() {
		return down_time;
	}
	public void setDown_time(Timestamp down_time) {
		this.down_time = down_time;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public int getStore_nums() {
		return store_nums;
	}
	public void setStore_nums(int store_nums) {
		this.store_nums = store_nums;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getAd_img() {
		return ad_img;
	}
	public void setAd_img(String ad_img) {
		this.ad_img = ad_img;
	}
	public int getIs_del() {
		return is_del;
	}
	public void setIs_del(int is_del) {
		this.is_del = is_del;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getSearch_words() {
		return search_words;
	}
	public void setSearch_words(String search_words) {
		this.search_words = search_words;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	public int getVisit() {
		return visit;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
	public int getFavorite() {
		return favorite;
	}
	public void setFavorite(int favorite) {
		this.favorite = favorite;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getSpec_array() {
		return spec_array;
	}
	public void setSpec_array(String spec_array) {
		this.spec_array = spec_array;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public int getIs_share() {
		return is_share;
	}
	public void setIs_share(int is_share) {
		this.is_share = is_share;
	}
	public int getOrdered_nums() {
		return ordered_nums;
	}
	public void setOrdered_nums(int ordered_nums) {
		this.ordered_nums = ordered_nums;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", goods_no=" + goods_no + ", model_id=" + model_id
				+ ", market_price=" + market_price + ", sell_price=" + sell_price + ", cost_price=" + cost_price
				+ ", up_time=" + up_time + ", down_time=" + down_time + ", create_time=" + create_time + ", store_nums="
				+ store_nums + ", img=" + img + ", ad_img=" + ad_img + ", is_del=" + is_del + ", content=" + content
				+ ", keywords=" + keywords + ", search_words=" + search_words + ", description=" + description
				+ ", weight=" + weight + ", point=" + point + ", unit=" + unit + ", brand_id=" + brand_id + ", visit="
				+ visit + ", favorite=" + favorite + ", sort=" + sort + ", spec_array=" + spec_array + ", exp=" + exp
				+ ", comments=" + comments + ", sale=" + sale + ", grade=" + grade + ", seller_id=" + seller_id
				+ ", is_share=" + is_share + ", ordered_nums=" + ordered_nums + "]";
	}
}
