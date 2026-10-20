package com.example.Crud.Pedidos;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Pedidos")
public class PedidosController{

    List<Pedidos> pd = new ArrayList<>();
    @PostMapping
    public String cadastrar(@RequestBody Pedidos pedidos){
        Pedidos pc = new Pedidos(pedidos.getStatusPedidos(), pedidos.getValor(), pedidos.getFormaPagamento(), pedidos.getDataPedidos());
        pd.add(pc);
        return "Sucesso no seu pedido";

    }
    @GetMapping
    public List<Pedidos> exibirTodos(){
        return pd;
    }


}

