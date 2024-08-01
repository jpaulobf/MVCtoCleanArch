package com.example.demo.clean.infrastructure.controllers;

import com.example.demo.clean.application.usecases.ProdutoUseCase;
import com.example.demo.clean.domain.entity.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v2/produto")
public class ProdutoController {

    private final ProdutoUseCase produtoUseCase;

    public ProdutoController(ProdutoUseCase produtoUseCase) {
        this.produtoUseCase = produtoUseCase;
    }

    @GetMapping
    public List<Produto> findAllProducts() {
        return this.produtoUseCase.findAllProducts();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Integer id) {
        return this.produtoUseCase.findProductById(id);
    }

    @PostMapping
    public Produto save(@RequestBody Produto produto) {
        return this.produtoUseCase.saveProduct(produto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return this.produtoUseCase.deleteProduct(id);
    }
}
