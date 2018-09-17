package com.desafio.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.desafio.models.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, String> {

}
