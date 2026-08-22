package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

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
@Table(name = "Movimiento")
@Data
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_movimiento; //[cite: 5]

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario; //[cite: 5]

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria; //[cite: 5]

    @Column(name = "tipo_movimiento", nullable = false)
    private String tipoMovimiento; // 'Ingreso' o 'Gasto'[cite: 5]

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal monto; //[cite: 5]

    @Column(length = 255)
    private String descripcion; //[cite: 5]

    @Column(nullable = false)
    private LocalDate fecha; //[cite: 5]
}