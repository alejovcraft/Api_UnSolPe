package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movimiento;
import com.example.demo.repository.MovimientoRepository;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoRepository movimientoRepository;

    @GetMapping
    public List<Movimiento> obtenerMovimientos() {
        return movimientoRepository.findAll();
    }
    @GetMapping("/usuario/{idUsuario}")
    public List<Movimiento> obtenerMovimientosPorUsuario(@PathVariable Integer idUsuario) {
        return movimientoRepository.buscarPorIdUsuario(idUsuario);
    }

    @PostMapping
    public Movimiento registrarMovimiento(@RequestBody Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }
}