package br.com.student.pedido_simple_adapter_android.entidades;

import android.os.Parcel;
import android.os.Parcelable;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Cliente implements Parcelable {

    private long id;
    private String nome;

    @Builder
    public Cliente() {
    }

    @Builder
    public Cliente(String nome) {
        this.id = id;
        this.nome = nome.toUpperCase();
    }

    @Builder
    private Cliente(Parcel from){
        this.id = from.readLong();
        this.nome = from.readString();
    }

    @Builder
    public Cliente(long id, String nome) {
        this.id = id;
        this.nome = nome.toUpperCase();
    }

    public static final Parcelable.Creator<Cliente> CREATOR = new Parcelable.Creator<Cliente>(){

        @Override
        public Cliente createFromParcel(Parcel source) {
            // TODO Auto-generated method stub
            return new Cliente(source);
        }

        @Override
        public Cliente[] newArray(int size) {
            // TODO Auto-generated method stub
            return new Cliente[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(nome);
    }
}
