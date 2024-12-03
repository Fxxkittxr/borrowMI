package br.univille.fsoweb20242borrowmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.fsoweb20242borrowmi.entity.Publicacao;
import br.univille.fsoweb20242borrowmi.repository.PublicacaoRepository;
import br.univille.fsoweb20242borrowmi.service.PublicacaoService;

@Controller
@RequestMapping("/publicacao")
public class PublicacaoController {

    @Autowired
    private PublicacaoService service;

    @GetMapping
    public ModelAndView index(){
        //chamar o banco de dados e fazer um select * from tabela
        var listaPublicacao = service.getAll();
        //montar a tela com os dados banco
        return new ModelAndView("cliente/index",
                "listaPublicacao", listaPublicacao);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var publicacao = new Publicacao();
        
        return new ModelAndView("cliente/form", 
                    "publicacao", publicacao);

    }
    @PostMapping
    public ModelAndView save(Publicacao publicacao){
        service.save(publicacao);
        return new ModelAndView("redirect:/publicacao");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var umaPublicacao = service.getById(id);

        return new ModelAndView("cliente/form", 
                    "publicacao",umaPublicacao);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        var umaPublicacao = service.getById(id);
        if(umaPublicacao != null){
            service.delete(id);
        }
        return new ModelAndView("redirect:/publicacao");
    }


}