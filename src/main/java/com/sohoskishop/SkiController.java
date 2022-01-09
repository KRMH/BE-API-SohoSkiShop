/**
 * 
 */
package com.sohoskishop;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sohoskishop.model.Ski;
import com.sohoskishop.model.SkiRepository;

/**
 * @author george
 *
 */
@RestController
public class SkiController {
	private final SkiRepository repository;
	
	SkiController (SkiRepository repository){
		this.repository = repository;
	}
	
	@GetMapping ("/skis")
	List<Ski> all(){
		return repository.findAll();
	}
	
	@PostMapping ("/skis")
	Ski newSki(@RequestBody Ski newSki) {
		return repository.save(newSki);
	}
	
	@GetMapping ("/skis/{id}")
	Ski one (@PathVariable int id) {
		return repository.findbyid
	}
}
