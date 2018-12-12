package com.ujjwal.newsportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.ujjwal.newsportal.db.DatabaseConnect;
import com.ujjwal.newsportal.model.News;

public class NewsDaoImpl implements NewsDao {
	Connection connect = DatabaseConnect.getMysqlConnection();
String fname, lname, insertnews, ntitle, pdate;

	@Override
	public List<News> listNews() {
		Connection con = DatabaseConnect.getMysqlConnection();
		List<News> newsList = listNews();
		if (con != null) {
			String sql = "Select * FROM news";
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				System.out.println("checking control = " + rs.next());
				while (rs.next()) {
					News news = new News();
					news.setId(rs.getInt("id"));
					news.setNewtitle(rs.getString("newtitle"));
					news.setDescription(rs.getString("description"));
					news.setImg(rs.getString("img"));
					newsList.add(news);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Mysql connection failed");
		}

		return newsList;
	}

	public void addNews(String newtitle, String description) {
		if (connect != null) {
			String sql = "INSERT INTO login(newtitle, description) VALUES (?, ?)";
			Connection conn = DatabaseConnect.getMysqlConnection();
			PreparedStatement preparedStatement;
			try {
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, newtitle);
				preparedStatement.setString(2, description);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void addNews(News news) {
		// TODO Auto-generated method stub

	}
	@Override
	public void insertnews(String fname, String lname, String insertnews, String ntitle, String pdate ) {
		if (connect != null) {
			String sql = "INSERT INTO news(firstname, lastname, newtitle, description, publishdate) VALUES (?, ?, ?, ?, ?)";
			Connection conn = DatabaseConnect.getMysqlConnection();
			PreparedStatement preparedStatement;
			try {
				preparedStatement = conn.prepareStatement(sql);
				preparedStatement.setString(1, fname);
				preparedStatement.setString(2, lname);
				preparedStatement.setString(3, ntitle);
				preparedStatement.setString(4, insertnews);
				preparedStatement.setString(5, pdate);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
	}

	@Override
	public void deleteNews(News news) {
		// TODO Auto-generated method stub

	}

	@Override
	public void connection() {
		// TODO Auto-generated method stub
	}

	@Override
	public void insertnews(News news) {
		// TODO Auto-generated method stub
		
	}

}
