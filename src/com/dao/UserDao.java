package com.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.User;

@Repository("userDao")
@Mapper
/*ʹ��Spring�Զ�ɨ��MyBatis�Ľӿڲ�����
Spring��ָ���������б�@Mapperע�ͱ�ע�Ľӿ��Զ�װ��ΪMyBatis��ӳ��ӿڣ�*/
public interface UserDao {
	
	  /*�ӿڷ�����ӦSQLӳ���ļ�_Mapper.xml�е�id*/
	
	  User queryByNamePwd(User user);
	  int register(User user);
}
