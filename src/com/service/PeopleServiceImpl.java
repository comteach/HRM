package com.service;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.PeopleDao;
import com.dao.UserDao;
import com.po.People;

@Service("peopleService")
@Transactional
public class PeopleServiceImpl implements PeopleService{
	
    @Autowired
    private PeopleDao peopleDao;
    
    public boolean addPeople(People people) {
    	return this.peopleDao.addPeople(people)>0 ? true:false;
    }
    
    public List<People> findAllPeople() {
		return this.peopleDao.findAllPeople();
	}
    
    public void deletePeople(int id) {
	this.peopleDao.deletePeople(id);
	}

    public People findPeopleById(int id) {
		return this.peopleDao.findPeopleById(id);
	}

    public boolean updatePeople(People people) {
		return this.peopleDao.updatePeople(people)>0 ? true:false;
	}
   
    public List<People> findPeopleByName(People people){
    	return this.peopleDao.findPeopleByName(people);
    } 
    
    /*public People findPeopleByName(String name) {
		return this.peopleDao.findPeopleByName(name);
	}
    */
}
