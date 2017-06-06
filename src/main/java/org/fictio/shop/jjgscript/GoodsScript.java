package org.fictio.shop.jjgscript;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.fictio.shop.pojo.Goods;

public class GoodsScript {

	public static List<Goods> getGoodsAndPhotoById(int goodsId, SqlSession session) {
		String statement = "org.fictio.shop.mapping.GoodsMapper.getGoodsAndPhotoById";
		return session.selectList(statement, goodsId);
	}

}
