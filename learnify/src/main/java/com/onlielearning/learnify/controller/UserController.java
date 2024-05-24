package com.onlielearning.learnify.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onlielearning.learnify.dto.User;

@Controller
public class UserController {
//	@RequestMapping(value="sendUser")
	@GetMapping("/sendUser")

	public ResponseEntity<User> sendUser(){
		User u = new User();
		u.setUserId("sai");
		u.setName("alajangi");
		return ResponseEntity.ok(u);
	}

}
