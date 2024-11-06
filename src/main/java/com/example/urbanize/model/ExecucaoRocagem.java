package com.example.urbanize.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class ExecucaoRocagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private PlanejamentoRocagem planejamentoRocagem;
    private Date dataExecucao;
    private String observacoes;
}
