package com.oliveira.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.financas.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
