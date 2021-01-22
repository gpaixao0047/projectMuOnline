package br.com.core.controller;

import static org.springframework.http.ResponseEntity.ok;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.core.entity.MembInfo;
import br.com.core.service.MembInfoService;


@Controller
@RequestMapping("/membinfo")
public class MembInfoController {

	@Autowired
	private MembInfoService service;
	
	@GetMapping
	@Transactional
	public ResponseEntity<List<MembInfo>> listar(){
		List<MembInfo> msg = service.listaMembInfo();
		return ok(msg);
	}
	
	@GetMapping("/totalcontas")
	@Transactional
	public ResponseEntity<Integer> getTotalContas(){
		Integer result = service.getTotalContas();
		return ok(result);
	}
}
