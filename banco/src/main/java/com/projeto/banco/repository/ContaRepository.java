package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

    boolean existsByDocumento(String documento);
}