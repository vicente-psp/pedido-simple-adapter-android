package br.com.student.pedido_simple_adapter_android.entidades;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Pedido {

    private long id;
    private Cliente cliente;
    private String data;
    private List<Produto> produtos;

    @Builder
    public Pedido(long id, Cliente cliente, String data, List<Produto> produtos) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.produtos = produtos;
    }
}
