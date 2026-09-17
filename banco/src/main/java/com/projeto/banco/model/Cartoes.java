package com.projeto.banco.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



public class Cartoes {
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String usuario;

    @Column(nullable=false)
    private String tipo_de_cartao;

    @Column(nullable=false)
    private String numero_do_cartao;

    @Column(nullable=false)
    private String bandeira_do_cartao;

    @Column(nullable=false, unique=true)
    private String nome_do_cartao;

    @Column(nullable=false)
    private Date data_de_validade;

   @Column(nullable=false, unique=true)
    private String CVV_do_cartao;

    @Column(nullable=false)
    private String notificacoes;

}
