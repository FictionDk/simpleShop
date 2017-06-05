package org.fictio.shop.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.fictio.shop.pojo.Goods;

public interface GoodsMapperDao {
	
	@Select("select * from jjg_goods where seller_id = #{sellerId}")
	public List<Goods> getGoodListBySellerId (int sellerId);

}
