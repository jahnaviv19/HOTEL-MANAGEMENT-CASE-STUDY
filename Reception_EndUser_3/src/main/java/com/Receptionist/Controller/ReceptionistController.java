package com.Receptionist.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceptionistController {

	
@GetMapping("/receptionist")
public String Hello() {
return "Hello World!!";
}
}