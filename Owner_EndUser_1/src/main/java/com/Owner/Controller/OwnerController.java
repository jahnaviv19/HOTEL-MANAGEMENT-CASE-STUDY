package com.Owner.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class OwnerController {



	@GetMapping("/owner")
	public String Hello() {
	return "Hello World!!";
	}
	}


