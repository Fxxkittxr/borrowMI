package br.univille.fsoweb20242borrowmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.fsoweb20242borrowmi.entity.Necessidades;
import br.univille.fsoweb20242borrowmi.service.NecessidadesService;

@Controller
@RequestMapping("/necessidades")
public class NecessidadesController {

    @Autowired
    private NecessidadesService service;

    @GetMapping
    public ModelAndView index(){
        //chamar o banco de dados e fazer um select * from tabela
        var listaNecessidade = service.getAll();
        //montar a tela com os dados banco
        return new ModelAndView("necessidades/index",
                "listaNecessidade", listaNecessidade);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var necessidades = new Necessidades();
        
        return new ModelAndView("necessidades/form", 
                    "necessidades", necessidades);

    }
    @PostMapping
    public ModelAndView save(Necessidades necessidades){
        service.save(necessidades);
        return new ModelAndView("redirect:/necessidades");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var umaNecessidade = service.getById(id);

        return new ModelAndView("necessidades/form", 
                    "necessidades",umaNecessidade);
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable("id") long id){
        var umaNecessidade = service.getById(id);
        if(umaNecessidade != null){
            service.delete(id);
        }
        return new ModelAndView("redirect:/necessidades");
    }


}