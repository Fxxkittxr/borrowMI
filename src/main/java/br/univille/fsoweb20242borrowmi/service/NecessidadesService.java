package br.univille.fsoweb20242borrowmi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.fsoweb20242borrowmi.entity.Necessidades;

@Service
public interface NecessidadesService {
    List<Necessidades> getAll();
    Necessidades save(Necessidades necessidades);
    Necessidades delete(long id);
    Necessidades getById(long id);
}


