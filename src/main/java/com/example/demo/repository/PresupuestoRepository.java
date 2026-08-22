package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Presupuesto;

public interface PresupuestoRepository extends JpaRepository<Presupuesto, Integer> {

}
