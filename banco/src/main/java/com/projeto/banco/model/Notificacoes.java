package com.projeto.banco.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name="tb_notificacoes")
@Getters
@NoArgsConstructor


public class Notificacoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @Column(nullable=false, unique=true)
    private String usuario;

    @Column(nullable=false)
    private String tipo_de_notificacao;

    @Column(nullable=false)
    private String Mensagem_da_notificacao;
    
    @Column(nullable=false)
    private String data_e_hora;

     @Column(nullable=false, unique=true)
    private Date data_da_aplicacao;


}
