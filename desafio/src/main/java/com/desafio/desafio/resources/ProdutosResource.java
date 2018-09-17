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

import com.desafio.desafio.models.Produtos;
import com.desafio.desafio.repository.ProdutosRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutosResource {
	
	@Autowired
	private ProdutosRepository er;

	@GetMapping(produces= "application/json")
	public @ResponseBody Iterable<Produtos> listaProdutos(){
		Iterable<Produtos> listaProdutos = er.findAll();
		return listaProdutos;
	}
	@PostMapping()
	public Produtos cadastraProdutos(@RequestBody @Valid Produtos produtos) {
		return er.save(produtos);
	}
 
	@DeleteMapping()
	public Produtos deletaLojas(@RequestBody Produtos produtos) {
		er.delete(produtos);
		return produtos;
	}
}
