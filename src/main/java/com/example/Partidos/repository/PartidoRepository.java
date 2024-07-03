package com.example.Partidos.repository;

import com.example.Partidos.entity.Partido;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PartidoRepository extends MongoRepository<Partido,Long> {
    //aca van las consultas manuales HQL
    List<Partido> findByEstado(String estado);
}
