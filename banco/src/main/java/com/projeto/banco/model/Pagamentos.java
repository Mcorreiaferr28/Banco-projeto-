package com.projeto.banco.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name="tb_pagamentos")
@Getters
@NoArgsConstructor


public class Pagamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String Tipo_de_pagamento;

    @Column(nullable=false)
    private Float Valor;

    @Column(nullable=false)
    private String Data_de_pagamento;

    @Column(nullable=false, unique=true)
    private String Beneficiario;

    @Column(nullable=false, unique=true)
    private String Comprovante;

}
