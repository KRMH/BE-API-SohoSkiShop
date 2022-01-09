/**
 * 
 */
package com.sohoskishop;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ResponseBody
	public ResponseEntity <List<Ski>> all(){
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}
	
	@PostMapping ("/ski")
	public ResponseEntity<Ski> newSki(@RequestBody Ski newSki) {
		Ski createdSki = repository.save(newSki);
		if (createdSki == null) {
	        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	    } else {
	        return new ResponseEntity<>(createdSki, HttpStatus.CREATED);
	    }
	}
	
	@GetMapping ("/ski/{id}")
	@ResponseBody
	public ResponseEntity<Ski> oneSki (@PathVariable("id") Integer id) {
		Ski getSki = new Ski(); 
		if (repository.existsById(id)) {
			getSki = repository.findById(id).get();
			return new ResponseEntity<>(getSki, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST) ;	
		}
		
	}
}
