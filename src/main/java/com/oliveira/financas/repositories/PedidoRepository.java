package com.oliveira.financas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveira.financas.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
