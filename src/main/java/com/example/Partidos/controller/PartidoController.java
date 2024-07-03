package com.example.Partidos.controller;

import com.example.Partidos.entity.Partido;
import com.example.Partidos.service.PartidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partidos")
public class PartidoController {
    @Autowired
    private PartidoService partidoService;

    @PostMapping
    public ResponseEntity<Partido> registrarPartido(@RequestBody Partido partido){
        return ResponseEntity.ok(partidoService.guardarPartido(partido));
    }

    @GetMapping
    public List<Partido> listarPartidos() { return partidoService.listarPartidos(); }


    @GetMapping("/VIVO")
    public List<Partido> listarPartidosVivo() { return partidoService.listarPartidosVivo(); }

}
