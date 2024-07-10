package com.example.demo.clean.application.usecases;

import com.example.demo.clean.application.gateways.ProdutoGateway;
import com.example.demo.clean.domain.entity.Produto;
import java.util.List;

public class ProdutoIteractor implements ProdutoUseCase {

    private final ProdutoGateway<Produto> produtoGateway;

    public ProdutoIteractor(ProdutoGateway<Produto> produtoGateway) {
        this.produtoGateway = produtoGateway;
    }

    @Override
    public List<Produto> findAllProducts() {
        return this.produtoGateway.findAll();
    }

    @Override
    public Produto findProductById(Integer id) {
        return this.produtoGateway.findById(id);
    }

    @Override
    public Produto saveProduct(Produto produto) {
        return this.produtoGateway.save(produto);
    }

    @Override
    public boolean deleteProduct(Integer id) {
        return this.produtoGateway.delete(id);
    }
}