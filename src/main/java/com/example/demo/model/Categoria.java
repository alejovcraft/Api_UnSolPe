package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Categoria")
@Data // Lombok genera getters y setters
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_categoria; //[cite: 5]

    @Column(nullable = false, length = 50)
    private String nombre; //[cite: 5]

    // En Java, los ENUM de MySQL suelen manejarse como Strings
    @Column(nullable = false)
    private String tipo; // Debe ser 'Ingreso' o 'Gasto'[cite: 5]
}