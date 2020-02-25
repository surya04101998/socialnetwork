package com.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Details;
import com.service.DBUtil;
import com.service.DetailsDao;

@Controller
public class MyController {

	@Autowired
	private DetailsDao detailsDao;
	
	@RequestMapping(value ="/home")
	public String claimPage(@ModelAttribute("details")Details details) {

		return "loginpage";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@ModelAttribute("details")Details details,ModelMap map) {
		
		if(detailsDao.authentication(details)) {
			return "loginpage";
		}
		
		
		return "";
		
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public String signup(@ModelAttribute("signup")Details details,ModelMap map) {
		return "SignUp";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public String success(@ModelAttribute("signup")Details details) {
		
		try {
			System.out.println("asdasd");
			Connection conn=DBUtil.getConnection();
			Statement st=conn.createStatement();
			String name=details.getName();
			String pass=details.getPassword();
			String email=details.getEmailid();
			int res=st.executeUpdate("insert into users values("+name+","+pass+","+email+")");
			if(res>0) {
				return "success";
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "SignUp";
	}
	
	
	

}
