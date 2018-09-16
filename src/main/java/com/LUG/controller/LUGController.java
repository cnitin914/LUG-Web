package com.LUG.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.LUG.model.User;

@Controller
@RequestMapping("/LUG")
public class LUGController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(path="/users",method=RequestMethod.GET)
	public String users(@RequestParam("max") String max,Model  model) {
		
		Map<String,String> urlVariables = new HashMap<String,String>();
		urlVariables.put("max", max);
		
		RestTemplate restTemplate = new RestTemplate();
		List<User> listOfUsers = (List<User>)restTemplate.getForObject("http://localhost:8080/user", List.class, urlVariables);
		model.addAttribute("users", listOfUsers);
		return "users";
	}
	

}
