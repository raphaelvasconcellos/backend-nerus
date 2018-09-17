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

import com.desafio.desafio.models.Estoque;
import com.desafio.desafio.repository.EstoqueRepository;

@RestController
@RequestMapping("/estoque")
public class EstoqueResource {
			
		@Autowired
		private EstoqueRepository er;

		@GetMapping(produces= "application/json")
		public @ResponseBody Iterable<Estoque> listaEstoque(){
			Iterable<Estoque> listaEstoque = er.findAll();
			return listaEstoque;
		}
		@PostMapping()
		public Estoque cadastraEstoque(@RequestBody @Valid Estoque estoque) {
			return er.save(estoque);
		}
	 
		@DeleteMapping()
		public Estoque deletaEstoque(@RequestBody Estoque estoque) {
			er.delete(estoque);
			return estoque;
		}
	}

