package br.com.front.controller;

import br.com.front.feign.FeignBuilder;
import br.com.front.service.PersonagensService;

public class PersonagensController {
	private static final PersonagensService service = FeignBuilder.getInstanceWithTokenAcess(PersonagensService.class);
	
	public Integer getTotalPersonagens() {
		return service.getTotalPersonagens();
	}
}
