package com.edu.EXAMAMANI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.EXAMAMANI.entity.Libro;
import com.edu.EXAMAMANI.service.LibroService;



@RestController
public class HomeController {
	@Autowired
	private LibroService libroservice;
	@GetMapping("/libro")
	public List<Libro> mensaje(){
		return libroservice.readAll();
		
		
	}
}
