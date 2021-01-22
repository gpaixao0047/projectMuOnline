package br.com.core.controller;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.core.service.CharacterService;

@Controller
@RequestMapping("/character")
public class CharacterController {

	@Autowired
	private CharacterService service;
	
	@GetMapping("/totalPersonagens")
	@Transactional
	public ResponseEntity<Integer> getTotalPersonagens(){
		Integer result = service.getTotalPersonagens();
		return ok(result);
	}
}
