package com.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBdaoImplement implements DBdao {

	public ResultSet selectCustom(int id) {
		Connection conn = null;
		try {
			conn = DBUtil.establishConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement("Select * from table whrre id=?;");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				return rs;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return null;

	}

	public String editUpdate(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
