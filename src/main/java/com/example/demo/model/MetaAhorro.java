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
@Table(name = "Meta_Ahorro")
@Data
public class MetaAhorro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_meta; //[cite: 5]

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario; //[cite: 5]

    @Column(nullable = false, length = 100)
    private String nombre; //[cite: 5]

    @Column(name = "monto_objetivo", nullable = false, precision = 10, scale = 2)
    private BigDecimal montoObjetivo; //[cite: 5]

    @Column(name = "monto_actual", precision = 10, scale = 2)
    private BigDecimal montoActual = BigDecimal.ZERO; //[cite: 5]

    @Column(name = "fecha_limite")
    private LocalDate fechaLimite; //[cite: 5]

    @Column(nullable = false)
    private String estado = "En progreso"; // 'En progreso' o 'Completada'[cite: 5]
}