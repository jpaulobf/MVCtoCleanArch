package com.example.demo.clean.infrastructure.gateways;

import com.example.demo.clean.domain.entity.Produto;
import com.example.demo.clean.infrastructure.persistences.ProdutoEntity;
import com.example.demo.clean.infrastructure.persistences.ProdutoRepository;

import java.util.ArrayList;
import java.util.List;

public class ProdutoEntityMapper {

    public static Produto entityToProduto(ProdutoEntity produtoEntity) {
        if (produtoEntity == null) {return null;}
        return (new Produto(produtoEntity.getId(), produtoEntity.getNome(), produtoEntity.getDescricao(), produtoEntity.getQuantidade(), produtoEntity.getPreco()));
    }

    public static ProdutoEntity produtoToEntity(Produto produto) {
        return (new ProdutoEntity(produto.id(), produto.nome(), produto.descricao(), produto.quantidade(), produto.preco()));
    }

    public static List<Produto> entityListToProdutoList(List<ProdutoEntity> produtoEntityList) {
        List<Produto> produtoList = new ArrayList<>();
        produtoEntityList.forEach(item -> produtoList.add(entityToProduto(item)));
        return (produtoList);
    }
}