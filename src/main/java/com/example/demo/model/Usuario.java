package com.example.demo.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Usuario")
@Data // Esto de Lombok crea automáticamente los getters, setters y constructores
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario; //[cite: 5]

    @Column(nullable = false, length = 100)
    private String nombre; //[cite: 5]

    @Column(nullable = false, length = 100, unique = true)
    private String correo; //[cite: 5]

    @Column(nullable = false, length = 255)
    private String contraseña; //[cite: 5]

    @CreationTimestamp
    @Column(name = "fecha_registro", updatable = false)
    private LocalDateTime fechaRegistro;

    // Gracias a @Data de Lombok, no necesitas escribir los getters y setters aquí abajo.
}