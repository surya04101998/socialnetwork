package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.model.Details;


@Service
public class DetailsDaoImpl implements DetailsDao {

	@Override
	public void AddDetails(Details details) {

		Connection conn=DBUtil.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("insert into details values(?,?,?,?)");
			
			ps.setString(1, details.getName());
			
			ps.setString(2, details.getPassword());
			
			ps.setString(1, details.getEmailid());
			
			ps.setString(1, details.getSigninAs());
			
			int x=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean authentication(Details details) {
		
		
		Connection conn=DBUtil.getConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select password from project where username=?;");
			
			ps.setString(1, details.getName());
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				if( rs.getString("password").equals(details.getPassword())) {
					System.out.println("success");
					return true;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}


}
