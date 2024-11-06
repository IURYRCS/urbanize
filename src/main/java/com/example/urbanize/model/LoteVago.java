package com.example.urbanize.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class LoteVago {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Endereco endereco;
    private double latitude;
    private double longitude;
    private float area;
    private Proprietario proprietario;
    private Enum status;

}
