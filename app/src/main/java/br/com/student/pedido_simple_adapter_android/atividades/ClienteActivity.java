package br.com.student.pedido_simple_adapter_android.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.student.pedido_simple_adapter_android.entidades.Cliente;

import br.com.student.pedido_simple_adapter_android.R;

public class ClienteActivity extends AppCompatActivity {

    ArrayList<Cliente> clientes = new ArrayList<>();
    EditText txtCliente;
            
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void adicionar(View view){
        txtCliente = findViewById(R.id.txtCliente);
        clientes.add(new Cliente(txtCliente.getText().toString()));
    }

    public void voltar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putParcelableArrayListExtra("clientes", clientes);
        setResult(RESULT_OK, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putParcelableArrayListExtra("clientes", clientes);
        setResult(RESULT_OK, intent);
        finish();
    }
}
