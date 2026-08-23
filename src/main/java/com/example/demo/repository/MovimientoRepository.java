package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer>  {
	List<Movimiento> findByIdUsuario(Integer idUsuario);
}
