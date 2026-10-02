package com.example.Crud.CadFilmes;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filmes")
public class filmesController {

    List<CadFilmes> CF = new ArrayList<>();
    @PostMapping
    public String cadastrar(@RequestBody CadFilmes filmes) {
        CadFilmes lf = new CadFilmes(filmes.getTitulo(), filmes.getGenero(), filmes.getDuracao(), filmes.getClassificacao(), filmes.getLancamento(), filmes.getSnopse(), filmes.getUrl());
        CF.add(lf);
        return "Filme Cadastrado Com Sucesso!!";
    }

    @GetMapping
    public List<CadFilmes> exibirTodos(){
        return CF;
    }

}
