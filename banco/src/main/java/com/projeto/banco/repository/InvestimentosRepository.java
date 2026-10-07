package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Investimentos;

public interface InvestimentosRepository extends JpaRepository<Investimentos, Long> {

    boolean existsByDocumento(String documento);
}