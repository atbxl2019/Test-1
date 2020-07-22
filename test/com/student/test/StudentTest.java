package com.student.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class StudentTest {
      public static void main(String[] args) {
		  
    	  //1,获取核心控制文件
    	  try {
			InputStream inpt = Resources.getResourceAsStream("myBatis-config.xml");
			SqlSessionFactory sqlFactory=new SqlSessionFactoryBuilder().build(inpt);
			SqlSession session=sqlFactory.openSession();
			int count=session.selectOne("com.test.student.dao.count");
			System.out.println("返回总行数："+count);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
