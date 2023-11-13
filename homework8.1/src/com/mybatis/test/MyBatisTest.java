	package com.mybatis.test;
	import java.io.IOException;
	import java.io.InputStream;
	import java.util.List;
	
	import org.apache.ibatis.io.Resources;
	import org.apache.ibatis.session.SqlSession;
	import org.apache.ibatis.session.SqlSessionFactory;
	import org.apache.ibatis.session.SqlSessionFactoryBuilder;
	import com.mybatis.po.MyApple;
	public class MyBatisTest {
		public static void main(String[] args) {
			try {
				//读取配置文件mybatis-config.xml
				InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
				//根据配置文件构建SqlSessionFactory
				SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(config);
				//通过SqlSessionFactory创建SqlSession
				SqlSession ss = ssf.openSession();
				MyApple mu = ss.selectOne("com.mybatis.mapper.UserMapper.selectUserById", 1);
				System.out.println(mu);
				MyApple addmu = new MyApple();
				addmu.setUname("苹果1");
				addmu.setuprice("17");
				ss.insert("com.mybatis.mapper.UserMapper.addUser",addmu);
				MyApple updatemu = new MyApple();
				updatemu.setUid(1);
				updatemu.setUname("苹果2");
				updatemu.setuprice("16");
				ss.update("com.mybatis.mapper.UserMapper.updateUser", updatemu);
				ss.delete("com.mybatis.mapper.UserMapper.deleteUser", 3);
				List<MyApple> listMu = ss.selectList("com.mybatis.mapper.UserMapper.selectAllUser");
				for (MyApple myUser : listMu) {
					System.out.println(myUser);
				}
				ss.commit();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
