package com.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.po.User;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	
    private UserDao userDAO;
    /*public void setUserDao(UserDao userDao) {
		this.userDAO = userDao;
	}*/
    /*  public UserServiceImpl() {
        this.userDAO = new UserDaoImpl();
    }*/
    
	@Override
   /* public boolean queryByNamePwd(String uName,String up){
        return this.userDAO.queryByNamePwd(uName, up);
    }*/
    public boolean login(User user) {
	   if(userDAO.queryByNamePwd(user)==null) {
		   return false;
	   }else {
		   return true;
	   }
   }
   public int register(User user) {
        return this.userDAO.register(user);
   }
}
