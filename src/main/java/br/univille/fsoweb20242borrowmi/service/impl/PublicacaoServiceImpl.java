package br.univille.fsoweb20242borrowmi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.fsoweb20242borrowmi.entity.Publicacao;
import br.univille.fsoweb20242borrowmi.repository.PublicacaoRepository;
import br.univille.fsoweb20242borrowmi.service.PublicacaoService;

@Service
public class PublicacaoServiceImpl implements PublicacaoService{

    @Autowired
    private PublicacaoRepository repository;

    @Override
    public List<Publicacao> getAll() {
        return repository.findAll();
    }

    @Override
    public Publicacao save(Publicacao publicacao) {
        repository.save(publicacao);
        return publicacao;
    }

    @Override
    public Publicacao delete(long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent()){
            repository.deleteById(id);
            return retorno.get();
        }
        return null;
    }

    @Override
    public Publicacao getById(long id) {
        var retorno = repository.findById(id);
        if(retorno.isPresent())
            return retorno.get();
        return null;
    }
    
}
