package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.po.People;

@Repository("peopleDao")
@Mapper
/*使用Spring自动扫描MyBatis的接口并配置
Spring将指定包中所有被@Mapper注释标注的接口自动装配为MyBatis的映射接口）*/
public interface PeopleDao{
	
	/*接口方法对应到SQL映射文件_Mapper.xml中的id*/
	
	public int addPeople(People people);
	
	public List<People> findAllPeople();
	 
	public void deletePeople(int id);
	
	public People findPeopleById(int id);
	
	public int updatePeople(People People);
 
	public List<People> findPeopleByName(People people);
	
    //public People findPeopleByName(@Param("name")String name);
}
