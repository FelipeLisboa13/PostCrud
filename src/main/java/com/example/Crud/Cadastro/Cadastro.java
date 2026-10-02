package com.example.Crud.Cadastro;

import java.time.LocalDate;

public class Cadastro {
    private int id = 0;
    private String nome;
    private LocalDate dtNasc;
    private String senha;
    private String genero;

    public Cadastro(){}
    public Cadastro(String nome, LocalDate dtNasc, String senha, String genero) {
        id = getId();
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.senha = senha;
        this.genero = genero;
    }

    public int getId() {
        id += 1;
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
