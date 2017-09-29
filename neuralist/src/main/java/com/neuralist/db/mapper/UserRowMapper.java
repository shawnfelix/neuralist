package com.neuralist.db.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.neuralist.db.model.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet row, int rowNum) throws SQLException {
		User user = new User();
		user.setUserId(row.getInt("user_id"));
		user.setEmailAddress(row.getString("email_address"));
		user.setPassword(row.getString("password"));
		return user;
	}
	

	
	

}
