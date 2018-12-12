package com.ujjwal.newsportal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ujjwal.newsportal.dao.NewsDao;
import com.ujjwal.newsportal.dao.NewsDaoImpl;

@Controller
public class NewsController {

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String newssubmit(HttpServletRequest request) {

		String fn = request.getParameter("firstname"); 
		String ln = request.getParameter("lastname");
		String nt = request.getParameter("newstitle");
		String in = request.getParameter("insertnewsTextarea");
		String pd = request.getParameter("publishdate");
		
		NewsDao ud = new NewsDaoImpl();
		ud.connection();
		ud.insertnews(fn, ln, nt, in, pd);
		return "success";
	}
}
