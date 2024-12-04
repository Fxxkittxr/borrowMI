package br.univille.fsoweb20242borrowmi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.univille.fsoweb20242borrowmi.entity.Publicacao;

@Service
public interface PublicacaoService {
    List<Publicacao> getAll();
    Publicacao save(Publicacao publicacao);
    Publicacao delete(long id);
    Publicacao getById(long id);
}


