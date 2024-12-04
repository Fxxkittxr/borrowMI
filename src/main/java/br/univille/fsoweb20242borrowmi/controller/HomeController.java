package br.univille.fsoweb20242borrowmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.fsoweb20242borrowmi.service.NecessidadesService;
import br.univille.fsoweb20242borrowmi.service.PublicacaoService;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PublicacaoService PublicacaoService;

    @Autowired
    private NecessidadesService NecessidadesService; // Adicionar o service de Necessidade

    @GetMapping
    public ModelAndView index() {
        var listaPublicacao = PublicacaoService.getAll();
        var listaNecessidade = NecessidadesService.getAll(); // Buscar as necessidades

        ModelAndView modelAndView = new ModelAndView("home/index");
        modelAndView.addObject("listaNecessidade", listaNecessidade);
        modelAndView.addObject("listaPublicacao", listaPublicacao);
         

        return modelAndView; 
    }
    
}