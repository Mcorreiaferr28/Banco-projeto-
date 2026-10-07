package com.git.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.banco.model.Notificacoes;

public interface NotificacoesRepository extends JpaRepository<Notificacoes, Long> {

    boolean existsByDocumento(String documento);
}