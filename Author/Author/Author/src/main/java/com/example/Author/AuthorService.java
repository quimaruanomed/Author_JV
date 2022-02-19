package com.example.Author;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	
	     
		//constructor: int id, String name, String country, int dob, int qtyBooks, Boolean alive	
		static List<Author>  authors = new ArrayList<Author>(); 
		static {
			
			Author author1 = new Author (1, "Paulo Coelho","Rio de Janeiro",1947,023, false);
			Author author2 = new Author (2, "Isabel Allende", "Lima", 1942, 143, false);
			Author author3 = new Author (3, "Stephen King","Portland", 1947, 204, false);
			
			authors.add(author1);
			authors.add(author2);
			authors.add(author3);
		}
		
		public List<Author> queryAuthor() {
			return authors;
		}
	}


