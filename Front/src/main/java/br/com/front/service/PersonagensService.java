package br.com.front.service;

import feign.RequestLine;

public interface PersonagensService {

	@RequestLine("GET /character/totalPersonagens")
	public Integer getTotalPersonagens();

}
