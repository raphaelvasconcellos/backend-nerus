package com.desafio.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.desafio.models.Estoque;

public interface EstoqueRepository extends JpaRepository <Estoque, String> {

}
