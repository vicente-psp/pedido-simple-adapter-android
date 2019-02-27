package br.com.student.pedido_simple_adapter_android.atividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.student.pedido_simple_adapter_android.R;
import br.com.student.pedido_simple_adapter_android.entidades.Cliente;

public class MainActivity extends AppCompatActivity {

    private final int CLIENTE = 1;
    private final int PEDIDO = 2;
    private final int PRODUTO = 3;   

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openViewPedido(View view) {
        startActivity(new Intent(this, PedidoActivity.class));
    }

    public void openViewCliente(View view) {
        Cliente cliente = new Cliente(1, "Glauber");
//        ArrayList<Cliente> clientes = new ArrayList<>();
//        clientes.add(cliente);
        Intent intent = new Intent(this, ClienteActivity.class);
//        intent.putParcelableArrayListExtra("clientes", clientes);
        intent.putExtra("cliente", cliente);
        startActivity(intent);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CLIENTE) { // pegar objeto vindo da tela cliente
            if (resultCode == Activity.RESULT_OK) {               
                String message = data.getStringExtra("MESSAGE");
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Não deu certo", Toast.LENGTH_SHORT).show();
            }
        } else if (requestCode == PEDIDO) {  // pegar objeto vindo da tela pedido
            if (resultCode == Activity.RESULT_OK) {               
                String message = data.getStringExtra("MESSAGE");
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Não deu certo", Toast.LENGTH_SHORT).show();
            }
        } else if (requestCode == PRODUTO) {  // pegar objeto vindo da tela produto
            if (resultCode == Activity.RESULT_OK) {               
                String message = data.getStringExtra("MESSAGE");
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Não deu certo", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
