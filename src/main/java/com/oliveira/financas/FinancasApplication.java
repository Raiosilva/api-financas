package com.oliveira.financas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oliveira.financas.model.Categoria;
import com.oliveira.financas.model.Cidade;
import com.oliveira.financas.model.Cliente;
import com.oliveira.financas.model.Endereco;
import com.oliveira.financas.model.Estado;
import com.oliveira.financas.model.Produto;
import com.oliveira.financas.model.enums.TipoCliente;
import com.oliveira.financas.repositories.CategoriaRepository;
import com.oliveira.financas.repositories.CidadeRepository;
import com.oliveira.financas.repositories.ClienteRepository;
import com.oliveira.financas.repositories.EnderecoRepository;
import com.oliveira.financas.repositories.EstadoRepository;
import com.oliveira.financas.repositories.ProdutoRepository;

@SpringBootApplication
public class FinancasApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository; 
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(FinancasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "04422233309", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("333444555666", "111222333444"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 404", "Jardim", "36453344", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Margarida", "334", "Sala 404", "Centro", "36453554", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		
		
		
	}

	
}
