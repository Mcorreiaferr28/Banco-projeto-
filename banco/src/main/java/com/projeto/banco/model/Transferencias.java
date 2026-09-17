package com.projeto.banco.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity(name="tb_transferencias")
@Getters
@NoArgsConstructor

public class Transferencias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String usuario;

    @Column(nullable=false)
    private String tipo_de_transferencia;
;

    @Column(nullable=false, unique=true)
    private String conta_de_origem;

    @Column(nullable=false, unique=true)
    private String conta_de_destinatario;

    @Column(nullable=false)
    private Float valor;

    @Column(nullable=false)
    private String descricao;

    @Column(nullable=false, unique=true)
    private String comprovante;


}
