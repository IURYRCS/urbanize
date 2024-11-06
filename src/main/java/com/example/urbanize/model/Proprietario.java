package com.example.urbanize.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Proprietario extends Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private LoteVago loteVago;


}
