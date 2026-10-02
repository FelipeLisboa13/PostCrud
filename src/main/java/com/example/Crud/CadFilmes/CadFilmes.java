package com.example.Crud.CadFilmes;

import java.time.LocalDate;

public class CadFilmes {

    private int id = 0;
    private String titulo;
    private String genero;
    private int duracao;
    private int classificacao;
    private LocalDate lancamento;
    private String snopse;
    private String url;

public CadFilmes(){}
    public CadFilmes(String titulo, String genero, int duracao, int classificacao, LocalDate lancamento, String snopse, String url) {
        id = getId();
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.lancamento = lancamento;
        this.snopse = snopse;
        this.url = url;
    }

    public int getId() {
       id += 1;
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public LocalDate getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDate lancamento) {
        this.lancamento = lancamento;
    }

    public String getSnopse() {
        return snopse;
    }

    public void setSnopse(String snopse) {
        this.snopse = snopse;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}



