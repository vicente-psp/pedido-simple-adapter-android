package br.com.student.pedido_simple_adapter_android.entidades;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
class Cliente {

    private long id;
    private String nome;

    @Builder
    public Cliente(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

}
