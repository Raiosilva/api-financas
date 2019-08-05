package com.oliveira.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.financas.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
