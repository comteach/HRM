package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.po.People;

@Repository("peopleDao")
@Mapper
/*ʹ��Spring�Զ�ɨ��MyBatis�Ľӿڲ�����
Spring��ָ���������б�@Mapperע�ͱ�ע�Ľӿ��Զ�װ��ΪMyBatis��ӳ��ӿڣ�*/
public interface PeopleDao{
	
	/*�ӿڷ�����Ӧ��SQLӳ���ļ�_Mapper.xml�е�id*/
	
	public int addPeople(People people);
	
	public List<People> findAllPeople();
	 
	public void deletePeople(int id);
	
	public People findPeopleById(int id);
	
	public int updatePeople(People People);
 
	public List<People> findPeopleByName(People people);
	
    //public People findPeopleByName(@Param("name")String name);
}
