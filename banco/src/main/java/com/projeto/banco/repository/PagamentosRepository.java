package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Pagamentos;

public interface PagamentosRepository extends JpaRepository<Pagamentos, Long> {

    boolean existsByDocumento(String documento);
}