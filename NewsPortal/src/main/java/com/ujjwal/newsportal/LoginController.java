package com.ujjwal.newsportal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ujjwal.newsportal.dao.LoginUserDao;
import com.ujjwal.newsportal.dao.LoginUserDaoImpl;
import com.ujjwal.newsportal.dao.NewsDao;
import com.ujjwal.newsportal.dao.NewsDaoImpl;

@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String account(Model model) {
		return "loginnsignup";
	}
	@RequestMapping(value = "/news/register", method = RequestMethod.GET)
	public String register(Model model) {
		return "register";
	}

	@RequestMapping(value = "/login/create", method = RequestMethod.POST)
	public String loggedAccounts(HttpServletRequest request) {
		System.out.println("Controller in loginnnnnnnnnnnnn");

		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		LoginUserDao ud = new LoginUserDaoImpl();
		ud.connection();
		ud.createuser(username, pwd);
		return "insertnews";
		
	}
	
	@RequestMapping(value = "news/submit", method = RequestMethod.POST)
	public String newssubmit(HttpServletRequest request) {
		System.out.println("Controller in news submit............");

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
	
	
	@RequestMapping(value = "/notfound", method = RequestMethod.GET)
	public String userNotFound(Model model) {
		return "404";
	}

	@RequestMapping(value = "/account/login", method = RequestMethod.POST)
	public void logIn(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("uname");
		String pwd = request.getParameter("pwd");
		LoginUserDao ud = new LoginUserDaoImpl();
		ud.connection();
		boolean validuser = ud.isValiduser(username, pwd);

		try {
			if (validuser) {
				response.sendRedirect("http://localhost:8080/newsportal/insertnews");
			} else {
				response.sendRedirect("http://localhost:8080/newsportal/404");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}