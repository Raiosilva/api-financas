package com.oliveira.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.financas.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
