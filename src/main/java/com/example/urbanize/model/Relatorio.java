package com.example.urbanize.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String tipoRelatorio;

    private String dadosRelatorio;

}
