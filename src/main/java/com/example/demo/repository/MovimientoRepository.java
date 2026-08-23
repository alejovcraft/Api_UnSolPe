package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>  {
	// Ojo: Asegúrate de que "id_usuario" coincida exactamente con cómo 
    // se llama la variable en tu clase Movimiento.java
    @Query("SELECT m FROM Movimiento m WHERE m.id_usuario = ?1")
    List<Movimiento> buscarPorIdUsuario(Integer idUsuario);
}
