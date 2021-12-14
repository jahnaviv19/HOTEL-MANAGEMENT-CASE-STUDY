package com.Reservation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationMicroservice {

	@GetMapping("/reservation")
	  public String bye() {
		  return "Hello World";
	  }
}
