package org.fictio.shop.jjg;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.fictio.shop.jjgscript.GoodsCopyScript;
import org.fictio.shop.pojo.Goods;

public class App {
    public static void main( String[] args ){
        System.out.println( "app start" );
        String resouce = "conf.xml";
        InputStream in = App.class.getClassLoader().getResourceAsStream(resouce);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        List<Goods> goodList = GoodsCopyScript.goodsContentClone(session);
        //GoodsCopyScript.goodsAttributeClone(goodList, session);
        
        session.close();
        try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("app over");
    }
}
