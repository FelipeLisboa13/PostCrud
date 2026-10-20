package com.example.Crud.Pedidos;

import java.time.LocalDateTime;

public class Pedidos {

    private int id = 0;
    private String statusPedidos;
    private double valor;
    private String formaPagamento;
    private LocalDateTime dataPedidos;

    public Pedidos(String statusPedidos, double valor, String formaPagamento, LocalDateTime dataPedidos) {
        this.id = id;
        this.statusPedidos = statusPedidos;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPedidos = dataPedidos;
    }

    public int getId(){
        id += 1;
        return id;
    }

    public LocalDateTime getDataPedidos() {
        return dataPedidos;
    }

    public void setDataPedidos(LocalDateTime dataPedidos) {
        this.dataPedidos = dataPedidos;
    }

    public String getStatusPedidos() {
        return statusPedidos;
    }

    public void setStatusPedidos(String statusPedidos) {
        this.statusPedidos = statusPedidos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }



}