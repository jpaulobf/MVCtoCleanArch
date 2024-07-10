package com.example.demo.mvc.model.repository;

import com.example.demo.mvc.model.dto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
