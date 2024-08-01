package com.example.demo.clean.main;

import com.example.demo.clean.application.gateways.ProdutoGateway;
import com.example.demo.clean.application.usecases.ProdutoIteractor;
import com.example.demo.clean.application.usecases.ProdutoUseCase;
import com.example.demo.clean.domain.entity.Produto;
import com.example.demo.clean.infrastructure.gateways.ProdutoRepositoryGateway;
import com.example.demo.clean.infrastructure.persistences.ProdutoRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdutoConfig {

    @Bean
    ProdutoUseCase produtoInteractor(ProdutoGateway<Produto> produtoGateway) {
        return new ProdutoIteractor(produtoGateway);
    }

    @Bean
    ProdutoGateway<Produto> produtoGateway(ProdutoRepository cleanProdutosRepository) {
        return new ProdutoRepositoryGateway(cleanProdutosRepository);
    }
}