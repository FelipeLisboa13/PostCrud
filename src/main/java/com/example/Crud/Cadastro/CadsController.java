package com.example.Crud.Cadastro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class CadsController {

    List<Cadastro> logins = new ArrayList<>();
    @PostMapping
    public String cadastrar(@RequestBody Cadastro usuario){
        Cadastro login = new Cadastro(usuario.getNome(),usuario.getDtNasc(), usuario.getSenha(), usuario.getGenero());
        logins.add(login);
        return "Usuario cadastrado com sucesso";
    }

    @GetMapping
    public List<Cadastro> mostrarTodos(){
        return logins;
    }
}