package com.Owner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerEnduser {

	@GetMapping("/owner")
	public String helloworld() {
		return "Hello World";
	}
}
