package com.example.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//url:localhost:8080/api/authors   
@RestController
@RequestMapping("api")
public class AuthorRestController {
	
	@Autowired
	AuthorService authorservice;
	
	//here we are creating our endpoint rest api
	@GetMapping("authors")
	public Iterable<Author> getAllAuthor() {
		//to-do 
		return authorservice.queryAuthor();
	}
	
	
}


