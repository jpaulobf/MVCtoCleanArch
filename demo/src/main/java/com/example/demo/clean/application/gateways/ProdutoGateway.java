package com.example.demo.clean.application.gateways;

import com.example.demo.clean.domain.entity.Produto;

import java.util.List;

public interface ProdutoGateway<T> {

    public List<T> findAll();

    public T findById(Integer id);

    public T save(T produto);

    public boolean delete(Integer id);

}
