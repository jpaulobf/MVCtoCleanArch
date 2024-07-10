package com.example.demo.clean.infrastructure.gateways;

import com.example.demo.clean.application.gateways.ProdutoGateway;
import com.example.demo.clean.domain.entity.Produto;
import com.example.demo.clean.infrastructure.persistences.ProdutoEntity;
import com.example.demo.clean.infrastructure.persistences.ProdutoRepository;
import java.util.List;

public class ProdutoRepositoryGateway implements ProdutoGateway<Produto> {

    private final ProdutoRepository repository;

    public ProdutoRepositoryGateway(ProdutoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Produto> findAll() {
        return ProdutoEntityMapper.entityListToProdutoList(repository.findAll());
    }

    @Override
    public Produto findById(Integer id) {

        ProdutoEntity produtoEntity = repository.findById(id).orElse(null);

        return ProdutoEntityMapper.entityToProduto(produtoEntity);
    }

    @Override
    public Produto save(Produto produto) {

        ProdutoEntity produtoEntity = ProdutoEntityMapper.produtoToEntity(produto);

        produtoEntity = repository.save(produtoEntity);

        return ProdutoEntityMapper.entityToProduto(produtoEntity);

    }

    @Override
    public boolean delete(Integer id) {
        try {
            repository.deleteById(id);
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
}
