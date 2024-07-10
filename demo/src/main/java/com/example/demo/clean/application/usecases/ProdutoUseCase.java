package com.example.demo.clean.application.usecases;

import com.example.demo.clean.domain.entity.Produto;

import java.util.List;

public interface ProdutoUseCase {

    public List<Produto> findAllProducts();

    public Produto findProductById(Integer id);

    public Produto saveProduct(Produto produto);

    public boolean deleteProduct(Integer id);

}
