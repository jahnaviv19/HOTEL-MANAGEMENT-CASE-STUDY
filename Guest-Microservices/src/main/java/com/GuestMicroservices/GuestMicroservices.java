package com.GuestMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestMicroservices {

	@GetMapping("/guest")
	  public String bye() {
		  return "Hello World";
	  }
}
