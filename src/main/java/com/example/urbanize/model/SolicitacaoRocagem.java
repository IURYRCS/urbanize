package com.example.urbanize.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity

public class SolicitacaoRocagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LoteVago loteVago;
    private Date dataSolicitacao;
    private Usuario usuario;
    private String status;

}
