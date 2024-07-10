package com.example.demo.clean.infrastructure.persistences;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Integer> {
}
