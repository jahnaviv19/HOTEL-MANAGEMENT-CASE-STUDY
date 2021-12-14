package com.DepartmentMicroservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentMicroservices {

	@GetMapping("/department")
	public String helloworld() {
		return "Hello World";
	}
}
