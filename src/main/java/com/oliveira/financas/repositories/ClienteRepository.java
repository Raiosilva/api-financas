package com.oliveira.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.financas.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
