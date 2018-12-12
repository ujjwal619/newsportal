package com.ujjwal.newsportal.dao;

public interface LoginUserDao {
	public void connection();
	public void createuser(String username, String password);
	public boolean isValiduser(String username, String password);

}
