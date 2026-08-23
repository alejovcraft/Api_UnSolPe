package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @PostMapping("/login")
    public ResponseEntity<?> loginUsuario(@RequestBody Map<String, String> credenciales) {
        String correo = credenciales.get("correo");
        String contrasena = credenciales.get("contraseña"); // Respetamos la "ñ" que envía Swift
        
        // AQUÍ NECESITAS BUSCAR EN LA BASE DE DATOS
        // Asumiendo que creaste un método en tu UsuarioRepository para buscar por ambas cosas:
        Usuario usuario = usuarioRepository.findByCorreoAndContraseña(correo, contrasena);
        
        if (usuario != null) {
            // Si el usuario existe, respondemos con código 200 (OK)
            return ResponseEntity.ok(usuario); 
        } else {
            // Si no existe o la contraseña está mal, respondemos con código 401 (No autorizado)
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Correo o contraseña incorrectos");
        }
    }
    // Swift hará un GET a /api/usuarios para obtener la lista
    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepository.findAll();
    }

    // Swift hará un POST a /api/usuarios enviando un JSON para registrarse
    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}