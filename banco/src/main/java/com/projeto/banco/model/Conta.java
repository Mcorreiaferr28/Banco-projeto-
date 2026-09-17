package com.projeto.banco.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name="tb_contas")
@Getters
@NoArgsConstructor

public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true)
    private String Usuario;

    @Column(nullable=false)
    private String Tipo_de_conta;

    @Column(nullable=false)
    private Float Saldo;

    @Column(nullable=false, unique=true)
    private String Codigo_da_conta;

    @Column(nullable=false, unique=true)
    private String Agencia;

}
