package com.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


		
		@GetMapping(value = "/home")
		public String home()
		{
			return "home";
		}

	}

