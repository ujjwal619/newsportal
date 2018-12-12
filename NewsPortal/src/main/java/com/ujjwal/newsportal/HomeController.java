package com.ujjwal.newsportal;

import java.text.DateFormat;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ujjwal.newsportal.dao.NewsDaoImpl;
import com.ujjwal.newsportal.model.News;

import org.springframework.web.bind.annotation.PathVariable;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );	
		return "home";
	}
		
		@RequestMapping(value = "/homepage", method = RequestMethod.GET)
		public String homepage() {
		   // String Controller(@PathVariable("homepage") String argument){
			return "homepage";	
		}
		
		
		@RequestMapping(value = "/news", method = RequestMethod.GET)
		public String test(Model model) {
			NewsDaoImpl impl = new NewsDaoImpl();
			List<News>newsList = impl.listNews();
			System.out.println("newslist size="+ newsList.size());
			model.addAttribute("news", newsList);
			return "news";
		}
		
		@RequestMapping(value = "/add", method = RequestMethod.GET)
		public ModelAndView addNews(Model model) {
			ModelAndView modelView = new ModelAndView("news/insertnews");
			News news = new News();
			modelView.addObject("newsForm", news);
			return modelView;
}
}

