package com.example.urbanize.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class PlanejamentoRocagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private SolicitacaoRocagem solicitacaoRocagem;
    private Date dataPlanejamento;
    private Executor executor;
    private Recurso recurso;
    private String observacoes;

}
