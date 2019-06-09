package com.walletproject.corepackage.Controller;


//import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walletproject.corepackage.model.User;
import com.walletproject.corepackage.service.UserService;

@RestController
public class UserController {

	//private static final org.jboss.logging.Logger logger = LoggerFactory.logger(UserController.class);
	private UserService userService;
@RequestMapping(value = "/saveUser" , method= RequestMethod.POST)
public String saveUser(@PathVariable String userId, @RequestBody User user) {
	 userService.saveUser(user);
	 return "success";
	
}
}