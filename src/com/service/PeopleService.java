package com.service;

import java.util.List;

import com.po.People;

public interface PeopleService {
	 

     boolean addPeople(People people);
     
     List<People> findAllPeople();
     
     public void deletePeople(int id);
     
     People findPeopleById(int id);
 	
 	 boolean updatePeople(People people);
   	
 	 public List<People> findPeopleByName(People people); 
 	 
 	 //People findPeopleByName(String name);

}
