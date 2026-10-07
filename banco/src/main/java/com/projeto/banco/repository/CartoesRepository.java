package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Cartoes;

public interface CartoesRepository extends JpaRepository<Cartoes, Long> {

    boolean existsByDocumento(String documento);
}
