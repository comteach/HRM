package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.User;
import com.service.UserService;
import com.service.UserServiceImpl;



	
  /*  UserService userService;
     public void init() throws ServletException{
 		ApplicationContext ctxt = new ClassPathXmlApplicationContext("annotationContext.xml");
 		userService = (UserService) ctxt.getBean("userService");
 	}
    //重写init()方法，启动Spring IoC容器
    	public void init() throws ServletException{
  		ApplicationContext ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
  		userService = (UserService) ctxt.getBean("userService");
  	}
  	

      public UserServlet() {
        this.userService=new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
        String func = req.getParameter("func");
        HttpSession session = req.getSession();

        if ("querybynamepwd".equals(func)) {
            String name = req.getParameter("username");
            String pwd = req.getParameter("password");
            
            User user=new User();
            user.setUsername(name);
            user.setPassword(pwd);
            
            if (this.userService.login(user)) {
                session.setAttribute("username", name);
                req.getRequestDispatcher("controller.jsp").forward(req, resp);

            } else {
                req.getRequestDispatcher("login.jsp?message=login_error").forward(req, resp);

            }
        } 
     
    }*/

	@Controller
	public class UserController {
		/*将服务依赖注入到属性userService*/
		@Autowired
		private UserService userService;
		
		@RequestMapping("/login")
		public String login(User user,Model model) {
			if (this.userService.login(user)) {
				model.addAttribute("uname",user.getUsername());
				return "redirect:index";
			}else {
				return"login";
			}
		}
		
		@RequestMapping("/register")
		public String register(User user) {
	       System.out.println("用户名"+user.getUsername()+"密码"+user.getPassword());
		        userService.register(user);
		   return"login";	
		}
		
		
	}
