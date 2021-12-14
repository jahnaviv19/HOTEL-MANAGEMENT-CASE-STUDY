package com.Receptionist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptionEnduser {

	@GetMapping("/reception")
	  public String bye() {
		  return "Hello World";
	  }
}
