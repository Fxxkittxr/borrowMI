package br.univille.fsoweb20242borrowmi.service;

import java.util.List;

import br.univille.fsoweb20242borrowmi.entity.Publicacao;

public interface PublicacaoService {
    List<Publicacao> getAll();
    Publicacao save(Publicacao publicacao);
    Publicacao delete(long id);
    Publicacao getById(long id);
}
