package br.com.student.pedido_simple_adapter_android.entidades;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
class Produto {

    private long id;
    private String nome;
    private double valorUnitario;

    @Builder
    public Produto(long id, String nome, double valorUnitario) {
        this.id = id;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
    }
}
