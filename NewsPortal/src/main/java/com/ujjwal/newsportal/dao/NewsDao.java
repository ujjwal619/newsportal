package com.ujjwal.newsportal.dao;

import com.ujjwal.newsportal.model.News;

import java.util.List;

public interface NewsDao {
	public List<News> listNews();

	public void addNews(News news);

	public void deleteNews(News news);

	public void insertnews(News news);
	
	public void insertnews(String fname, String lname, String insertnews, String ntitle, String pdate );

	public void connection();
}
