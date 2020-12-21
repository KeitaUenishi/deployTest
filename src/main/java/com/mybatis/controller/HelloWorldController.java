package com.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@RequestMapping(name = "/", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("message", "こんにちは世界");
		return "index";
	}

	@RequestMapping(name = "/", method = RequestMethod.POST)
	public String nameToMessage(@RequestParam("name") String name, Model model) {
		model.addAttribute("message", "こんにちは" + name + "さん");
		return "index";
	}
}
