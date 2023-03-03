package com.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.User;

@Repository("userDao")
@Mapper
/*使用Spring自动扫描MyBatis的接口并配置
Spring将指定包中所有被@Mapper注释标注的接口自动装配为MyBatis的映射接口）*/
public interface UserDao {
	
	  /*接口方法对应SQL映射文件_Mapper.xml中的id*/
	
	  User queryByNamePwd(User user);
	  int register(User user);
}
