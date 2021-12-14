package com.StaffMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffMicroservice {

	@GetMapping("/Inventory")
	  public String bye() {
		  return "Hello World";
	  }
}
