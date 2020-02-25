package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.model.Details;
import com.util.DBUtil;


@Service
public class DetailsDaoImpl implements DetailsDao {

	@Override
	public void AddDetails(Details details) {

		Connection conn=DBUtil.provideConnection();
		
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
		
		
		Connection conn=DBUtil.provideConnection();
		
		try {
			PreparedStatement ps=conn.prepareStatement("select password from details where name=?;");
			
			ps.setString(1, details.getName());
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				return rs.getString("password").equals(details.getName());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}


}
