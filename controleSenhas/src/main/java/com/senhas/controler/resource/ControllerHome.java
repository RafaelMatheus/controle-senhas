package com.senhas.controler.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHome {

	@RequestMapping("/home")
	public String index() {
		return "index";
	}
}
