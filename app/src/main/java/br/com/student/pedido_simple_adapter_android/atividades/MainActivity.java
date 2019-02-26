package br.com.student.pedido_simple_adapter_android.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import br.com.student.pedido_simple_adapter_android.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openViewPedido(View view) {
        startActivity(new Intent(this, PedidoActivity.class));
    }

    public void openViewCliente(View view) {
        startActivity(new Intent(this, ClienteActivity.class));
    }
}
