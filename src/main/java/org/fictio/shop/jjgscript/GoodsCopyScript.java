package org.fictio.shop.jjgscript;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.fictio.shop.mapping.GoodsMapperDao;
import org.fictio.shop.pojo.CategoryExtend;
import org.fictio.shop.pojo.Goods;
import org.fictio.shop.pojo.GoodsPhotoRelation;


/**
 * 商品转换脚本实现
 * 2017-05-19
 * @author dk
 *
 */
public class GoodsCopyScript {
	
	/**
	 * 获取seller_id为22的所有商品
	 * @param session
	 * @return
	 */
	private static List<Goods> goodsGet(SqlSession session){
		GoodsMapperDao goodsMap = session.getMapper(GoodsMapperDao.class);
		return goodsMap.getGoodListBySellerId(22);
	}
	
	/**
	 * goods表克隆,将seller_id为22的商户改为98J,99R
	 * @param session
	 */
	public static List<Goods> goodsContentClone(SqlSession session){
		long time1 = System.currentTimeMillis();
		List<Goods> goodList = goodsGet(session);
		long time2 = System.currentTimeMillis();
		for(Goods good : goodList){
			String goodNo = good.getGoods_no();
			if(goodNo.charAt(0) == 'C'){
				goodNo = goodNo.replaceFirst("C", "J");
				good.setGoods_no(goodNo);
			}else{
				goodNo = "J" + goodNo;
				good.setGoods_no(goodNo);
			}
			System.out.println(good.getGoods_no()+"|"+good.getName());
			good.setSeller_id(98);
		}
		long time3 = System.currentTimeMillis();
		
		//String statement = "org.fictio.shop.mapping.GoodsMapper.addGoodList";
		//session.insert(statement, goodList);
		//session.commit();
		long time4 = System.currentTimeMillis();
		
		System.out.println(time2-time1);
		System.out.println(time3-time2);
		System.out.println(time4-time3);
		
		return goodList;
	}
	
	/**
	 * goodsPhotoRelation,categoryExtend表clone
	 * 
	 * @param goodList
	 * @param session
	 */
	public static void goodsAttributeClone(List<Goods> goodList,SqlSession session){
		long time1 = System.currentTimeMillis();
		int index = 0;
		int batchCount = 800;
		for(Goods good : goodList){
			index ++;
			List<Goods> goods = getGoodsByName(session,good);
			List<GoodsPhotoRelation> photoRelations  = null;
			List<CategoryExtend> goodCategorys = null;
			if(goods.get(0).getId() == good.getId()){
				photoRelations = getPhotoRelationsByGoodsId(session,goods.get(1).getId());
				goodCategorys = getGoodCategorysByGoodsId(session,goods.get(1).getId());
			}else{
				photoRelations = getPhotoRelationsByGoodsId(session,goods.get(0).getId());
				goodCategorys = getGoodCategorysByGoodsId(session,goods.get(0).getId());
			}
			if(photoRelations.size() > 0){
				clonePhotoRelations(session,photoRelations,good.getId());
			}
			if(goodCategorys != null && goodCategorys.size() >0){
				cloneGoodCategorys(session,goodCategorys,good.getId());
			}
			if(index%batchCount == 0 ){
				session.commit();
			}
		}
		long time2 = System.currentTimeMillis();
		System.out.println(time2-time1);
	}

	/**
	 * 替换goods_id并将数据插入category_extend表
	 * @param session
	 * @param goodCategorys
	 * @param id
	 */
	private static void cloneGoodCategorys(SqlSession session, List<CategoryExtend> goodCategorys, int id) {
		for(CategoryExtend item : goodCategorys){
			item.setGoods_id(id);
		}
		String statement = "org.fictio.shop.mapping.CategoryExtendMapper.insertCategoryExtendList";
		session.insert(statement,goodCategorys);
	}

	/**
	 * 根据goods_id查找category_extend中该商品的分类
	 * @param session
	 * @param id
	 * @return
	 */
	private static List<CategoryExtend> getGoodCategorysByGoodsId(SqlSession session, int id) {
		CategoryExtend temp = new CategoryExtend();
		temp.setGoods_id(id);
		String statement = "org.fictio.shop.mapping.CategoryExtendMapper.getCategoryExtendByGoodId";
		return session.selectList(statement, temp);
	}

	/**
	 * 替换goods_id并添加至goodsPhotoRelation表中
	 * @param session
	 * @param photoRelations
	 * @param id
	 */
	private static void clonePhotoRelations(SqlSession session, List<GoodsPhotoRelation> photoRelations, int id) {
		
		for(GoodsPhotoRelation item : photoRelations){
			item.setGoods_id(id);
		}
		String statement = "org.fictio.shop.mapping.PhotoRelationMapper.insertRelationList";
		session.insert(statement, photoRelations);
	}

	/**
	 * 根据goods_id查对应的imgRelations
	 * @param session
	 * @param id
	 * @return
	 */
	private static List<GoodsPhotoRelation> getPhotoRelationsByGoodsId(SqlSession session, int id) {
		GoodsPhotoRelation temp = new GoodsPhotoRelation();
		temp.setGoods_id(id);
		String statement = "org.fictio.shop.mapping.PhotoRelationMapper.getPhotoRelationsByGoodId";
		return session.selectList(statement, temp);
	}

	/**
	 * 根据goodsname获取相同的两个good
	 * @param session
	 * @param good
	 * @return
	 */
	private static List<Goods> getGoodsByName(SqlSession session, Goods good) {
		String statement = "org.fictio.shop.mapping.GoodsMapper.getGoodsByName";
		return session.selectList(statement, good);
	}
}
