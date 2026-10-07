package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Transferencias;

public interface TransferenciasRepository extends JpaRepository<Transferencias, Long> {

    boolean existsByDocumento(String documento);
}