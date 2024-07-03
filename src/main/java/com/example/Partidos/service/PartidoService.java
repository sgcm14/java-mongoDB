package com.example.Partidos.service;

import com.example.Partidos.entity.Estado;
import com.example.Partidos.entity.Partido;
import com.example.Partidos.repository.PartidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidoService {
    @Autowired
    private PartidoRepository partidoRepository;

    public Partido guardarPartido(Partido partido){
        return partidoRepository.save(partido);
    }

    public List<Partido> listarPartidos() { return partidoRepository.findAll(); }

    public List<Partido> listarPartidosVivo() { return partidoRepository.findByEstado("ENVIVO"); }
}
