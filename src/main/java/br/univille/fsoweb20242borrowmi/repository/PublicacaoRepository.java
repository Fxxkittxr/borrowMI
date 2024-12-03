package br.univille.fsoweb20242borrowmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.fsoweb20242borrowmi.entity.Publicacao;

@Repository
public interface PublicacaoRepository 
        extends JpaRepository<Publicacao,Long>{
}
