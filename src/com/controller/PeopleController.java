package com.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.People;
import com.service.PeopleService;
import com.service.UserService;


@Controller



public class PeopleController {
	/*将服务依赖注入到属性peopleService*/
	@Autowired
	private PeopleService peopleService;
	
	
	/*@RequestMapping将请求与处理方法一一对应*/
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model){
	    List<People> peoples= peopleService.findAllPeople();
		model.addAttribute("peoples",peoples);
		return "index";
	}
	
	@RequestMapping(value = "/addPeople" ,method = RequestMethod.POST)
	public String addPeople(Model model,String name, int age, String sex, String phone, String email, String school, String post,
			String salary, String resume, HttpServletRequest request, HttpServletResponse response) {
		
		    int success =0;
		
		    People people = new People();
			
			people.setName(name);
			people.setAge(age);
			people.setSex(sex);
			people.setPhone(phone);
			people.setEmail(email);
			people.setSchool(school);
			people.setPost(post);
			people.setSalary(salary);
			people.setResume(resume);
			Date date=new Date(); 			
			SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); 
			people.setDate(df.format(date));
			
			if (peopleService.addPeople(people)) {
				
				 success=1;
			}
			
		try {
			response.getWriter().write("{\"success\":"+success+"}");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:index";
	}
	
	@RequestMapping(value="/deletePeople", method=RequestMethod.GET)
	public String deletePeople(int id){
		peopleService.deletePeople(id);
		return "redirect:index";
	}
	
	
	@RequestMapping(value="/updatePeople", method=RequestMethod.GET)
	public String updatePeople(int param, int id,String name, Integer age, String sex, String phone, String email, String school, String post,
			String salary, String resume,Model model){
		People people=new People();
		try {
			if(param == 0){
				people = peopleService.findPeopleById(id);
				model.addAttribute("people",people);
				return "updatePeople";
			}else if(param == 1){		
				people.setId(id);
				people.setName(name);
				people.setAge(age);
				people.setSex(sex);
				people.setPhone(phone);
				people.setEmail(email);
				people.setSchool(school);
				people.setPost(post);
				people.setSalary(salary);
				people.setResume(resume);
				Date date=new Date(); 
				SimpleDateFormat df=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss"); //时间日期格式化
				people.setDate(df.format(date));
				System.out.println(people);
				Boolean aBoolean =  peopleService.updatePeople(people);
				System.out.println(aBoolean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:index";
	}
	
	
    @RequestMapping(value="/findPeopleByName", method=RequestMethod.GET)	
    public String findPeopleByName(People people,Model model) {    	
    	 List<People> peoples= peopleService.findPeopleByName(people);	
		 model.addAttribute("peoples",peoples);
		 return "index";
    }
    
    
    
    /*public String findPeopleByName(String name,Model model){
		 People people=null;
		 System.out.println(name);
		 List<People> peoples = new ArrayList<People>();
		 people = peopleService.findPeopleByName(name);
		 if (people!=null) {
			//向集合列表中插入对象
			peoples.add(people);
		 }else {
			peoples =peopleService.findAllPeople();
		 }
		
		 System.out.println(peoples);
		 model.addAttribute("peoples",peoples);
		 return "index";
	}*/
}
