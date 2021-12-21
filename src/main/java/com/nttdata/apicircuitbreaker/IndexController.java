package com.nttdata.apicircuitbreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import starter.Saludo;



@RestController
public class IndexController {
	@Autowired private Saludo s;
	
	
	/*@
	Autowired
	private Saludo saludo;*/
	
	
	private Long contadorIntentos = 0L;
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		return new ResponseEntity<String>(HttpStatus.OK).ok(s.mensajeSaludo()); //saludo.mensajeSaludo()
	}

}
