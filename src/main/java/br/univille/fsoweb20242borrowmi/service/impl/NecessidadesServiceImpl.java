package br.univille.fsoweb20242borrowmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.fsoweb20242borrowmi.entity.Necessidades;
import br.univille.fsoweb20242borrowmi.repository.NecessidadesRepository;
import br.univille.fsoweb20242borrowmi.service.NecessidadesService;

@Service
public class NecessidadesServiceImpl implements NecessidadesService{

    @Autowired
    private NecessidadesRepository repository;

    @Override
    public List<Necessidades> getAll() {
        return repository.findAll();
    }

    @Override
    public Necessidades save(Necessidades necessidades) {
        repository.save(necessidades);
        return necessidades;
    }

    @Override
    public Necessidades delete(long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent()){
            repository.deleteById(id);
            return retorno.get();
        }
        return null;
    }

    @Override
    public Necessidades getById(long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }
    
}
