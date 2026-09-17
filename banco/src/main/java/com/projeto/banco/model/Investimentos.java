package com.projeto.banco.model;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name="tb_investimentos")
@Getters
@NoArgsConstructor

public class Investimentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String usuario;

    @Column(nullable=false)
    private String tipo_de_investimento;

    @Column(nullable=false)
    private Float valor_investido;
    
    @Column(nullable=false)
    private Float rendimento;

    @Column(nullable=false, unique=true)
    private Date data_da_aplicacao;

}
