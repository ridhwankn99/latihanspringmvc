package com.eksad.latihanspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("/hello") //untuk mapping url
	@ResponseBody //untuk menampilkan fungsi yang kita buat
	public String sayHello() {
		return "Hello World";
	}
	@RequestMapping("/myName")
	@ResponseBody
	public String myName(@RequestParam String myName) { //masukin parameter
		return "Hello "+ myName;
	}
	@RequestMapping("/namaSaya/{myName}")
	@ResponseBody
	public String namaSaya(@PathVariable String myName) { //pathvariable ngambil dari url dari myName
		return "Hello "+ myName;
	}
	@RequestMapping("/toGoogle")
	@ResponseBody
	public String toGoogle() { //
		return "<a href='https://www.google.com' target='_blank'> Klik disini menuju Google </a>"
				+ "</br> <a href='https://www.youtube.com'> Klik disini menuju Youtube </a>";
	}
}
