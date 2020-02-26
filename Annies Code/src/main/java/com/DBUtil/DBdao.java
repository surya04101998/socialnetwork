package com.DBUtil;

import java.sql.ResultSet;

public interface DBdao {

	public ResultSet selectCustom(int id);

	public String editUpdate(int id);

}
