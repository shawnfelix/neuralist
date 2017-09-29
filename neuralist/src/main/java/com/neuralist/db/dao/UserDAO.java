package com.neuralist.db.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.neuralist.db.mapper.UserRowMapper;
import com.neuralist.db.model.User;

@Transactional
@Repository
public class UserDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//custom mapper
	public List<User> getAllUsersCustom() {
		String sql = "SELECT * FROM user_master";
		RowMapper<User> rowMapper = new UserRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}
	
	//default mapper
	public List<User> getAllUsers() {
		String sql = "SELECT * FROM user_master";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return this.jdbcTemplate.query(sql, rowMapper);
	}
}
