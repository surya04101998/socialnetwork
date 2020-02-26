package com.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Details;
//import com.mysql.jdbc.PreparedStatement;
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
			return "success";
		}
		
		
		return "loginpage";
		
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)
	public String signup(@ModelAttribute("signup")Details details,ModelMap map) {
		return "SignUp";
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public String success(@ModelAttribute("signup")Details details) {
		
		
			System.out.println("asdasd");
			Connection conn=DBUtil.getConnection();
			System.out.println("asdasdas");
			
			try {
				
				String name=details.getName();
				String pass=details.getPassword();
				String email=details.getEmailid();
				PreparedStatement st=conn.prepareStatement("insert into project values(?,?,?,?);");
				//PreparedStatement ps=conn.prepareStatement("insert into details values(?,?,?,?)");

				st.setInt(1,1);
				st.setString(2, name);
				st.setString(3, pass);
				st.setString(4, email);
				
				int res=st.executeUpdate();
				if(res>0) {
					return "success";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		return "SignUp";
	}
	
	
	

}
