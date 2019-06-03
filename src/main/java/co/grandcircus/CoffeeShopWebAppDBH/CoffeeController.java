package co.grandcircus.CoffeeShopWebAppDBH;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.CoffeeShopWebAppDBH.dao.UserRepository;
import co.grandcircus.CoffeeShopWebAppDBH.entity.User;

// This annotation lets the application know where to look for the methods,
//  required for the controller classes
@Controller
public class CoffeeController {

	// Used for Hibernate, but how?
	@Autowired
	UserRepository u;
	
	// This is how we are calling the methods in the controller class
	// @RequestMapping is routing URLs for the application
	@RequestMapping("/") // The forward slash is referencing the landing page
	public ModelAndView index() {
		return new ModelAndView("coffee");
	}
	
	// The forward slash is referencing the register page
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	// This method will accept data from the register page using Post
	// The data uses request parameters that match the name attribute in the
	//  form input fields
	@PostMapping("/add-user")
	public ModelAndView addNewUser(User user) {
		
//		User newUser = new User();
		u.save(user);
		
//		dao.addUser(fName,lName, emailAddress, phoneNumber, passwordString);
		
		// Sends user to the registration confirmation page
		return new ModelAndView("adduser", "hello", user);
	}
	

	
//	// JDBC methods
//	@Autowired
//	CoffeeJdbcDao dao;
	
}
