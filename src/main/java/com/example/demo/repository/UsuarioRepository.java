package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Spring Data JPA crea los métodos mágicamente.
    // Aquí puedes agregar métodos personalizados luego, como:
    // Optional<Usuario> findByCorreo(String correo);
}