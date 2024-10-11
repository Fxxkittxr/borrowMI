package br.univille.fsoweb20242.service;

import java.util.List;
import br.univille.fsoweb20242.entity.Publicacao;

public interface PublicacaoService {
    List<Publicacao> getAll();
    Publicacao save(Publicacao publicacao);
    Publicacao delete(long id);
    Publicacao getById(long id);
}
