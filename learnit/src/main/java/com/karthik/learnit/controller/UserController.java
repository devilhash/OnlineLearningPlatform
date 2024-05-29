package com.karthik.learnit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.karthik.learnit.dao.UserDao;
import com.karthik.learnit.dto.User;

 
@Controller
public class UserController {
	@PostMapping("/save")
	public ResponseEntity<User>  saveUser(@RequestBody User u){
		 
	 
		 try {
			 UserDao ud = new UserDao();
			     ud.saveDetails(u) ;
			 
			 
		 
		 }
		 catch(Exception e) {
				u=null;
			e.printStackTrace();
			 
		 }
	 
			return ResponseEntity.ok(u);
		 
		 
	}
}
