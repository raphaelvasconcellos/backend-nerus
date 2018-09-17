package com.desafio.desafio.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.desafio.models.Lojas;
import com.desafio.desafio.repository.LojasRepository;

@RestController
@RequestMapping("/lojas")
public class LojasResource {
	
	@Autowired
	private LojasRepository er;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Lojas> listaLojas() {
		Iterable<Lojas> listaLojas = er.findAll();
		return listaLojas;
		
	}
	@PostMapping()
	public Lojas cadastraLojas(@RequestBody @Valid Lojas lojas) {
		return er.save(lojas);
	}
 
	@DeleteMapping()
	public Lojas deletaLojas(@RequestBody Lojas lojas) {
		er.delete(lojas);
		return lojas;
	}
}
