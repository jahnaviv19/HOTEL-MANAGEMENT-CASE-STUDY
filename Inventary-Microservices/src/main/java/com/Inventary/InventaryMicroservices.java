package com.Inventary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventaryMicroservices {

	@GetMapping("/inventary")
	  public String bye() {
		  return "Hello World";
	  }
}
