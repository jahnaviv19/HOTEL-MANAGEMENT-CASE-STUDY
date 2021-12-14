package com.Manager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerEnduser {

	@GetMapping("/manager")
	  public String bye() {
		  return "Hello World";
	  }
}
