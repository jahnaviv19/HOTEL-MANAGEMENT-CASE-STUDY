package com.RoomMicroservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomMicroservice {

	@GetMapping("/room")
	  public String bye() {
		  return "Hello World";
	  }
}
