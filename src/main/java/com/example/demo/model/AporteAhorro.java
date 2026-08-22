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
@Table(name = "Aporte_Ahorro")
@Data
public class AporteAhorro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_aporte; //[cite: 5]

    @ManyToOne
    @JoinColumn(name = "id_meta", nullable = false)
    private MetaAhorro metaAhorro; //[cite: 5]

    @Column(name = "monto_aporte", nullable = false, precision = 10, scale = 2)
    private BigDecimal montoAporte; //[cite: 5]

    @Column(name = "fecha_aporte", nullable = false)
    private LocalDate fechaAporte; //[cite: 5]
}