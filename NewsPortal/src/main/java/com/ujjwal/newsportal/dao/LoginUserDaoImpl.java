package com.ujjwal.newsportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ujjwal.newsportal.db.DatabaseConnect;
import com.ujjwal.newsportal.model.User;

public class LoginUserDaoImpl implements LoginUserDao {
	Connection connect = null;

	@Override
	public void createuser(String username, String password) {
		if (connect != null) {
			Connection conn = DatabaseConnect.getMysqlConnection();
			String sql = "INSERT INTO login (username, password) VALUES (?, ?)";
			PreparedStatement preparedStatement;
			try {
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, username);
				preparedStatement.setString(2, password);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void connection() {
		connect = DatabaseConnect.getMysqlConnection();
	}

	@Override
	public boolean isValiduser(String username, String password) {
		try {
			String sql = "select * from login where username='" + username + "' and password='" + password + "'";
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			boolean hasUser = rs.next();
			return hasUser;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	}