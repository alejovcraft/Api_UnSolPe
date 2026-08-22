package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Presupuesto")
@Data
public class Presupuesto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_presupuesto; //[cite: 5]

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario; //[cite: 5]

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria; //[cite: 5]

    @Column(name = "monto_limite", nullable = false, precision = 10, scale = 2)
    private BigDecimal montoLimite; //[cite: 5]

    @Column(nullable = false)
    private Integer mes; //[cite: 5]

    @Column(nullable = false)
    private Integer anio; //[cite: 5]
}