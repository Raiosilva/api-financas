package com.oliveira.financas.model;

import java.util.Date;

import javax.persistence.Entity;

import com.oliveira.financas.model.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	
	private Date dataVenciamento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVenciamento = dataVencimento;
	}

	public Date getDataVenciamento() {
		return dataVenciamento;
	}

	public void setDataVenciamento(Date dataVenciamento) {
		this.dataVenciamento = dataVenciamento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
