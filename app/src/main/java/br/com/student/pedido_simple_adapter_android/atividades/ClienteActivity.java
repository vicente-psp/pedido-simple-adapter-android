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

//        Cliente cliente = getIntent().getExtras().getParcelable("cliente");
//        if (cliente != null) {
//            Log.i("id", cliente.getId()+"");
//            Log.i("cliente", cliente.getNome());
//        } else {
//            Toast.makeText(this, "cliente nulo ", Toast.LENGTH_LONG).show();
//        }
    }

    public void testar(View view){

        txtCliente = findViewById(R.id.txtCliente);
        Cliente cliente = new Cliente(txtCliente.getText().toString());
        clientes.add(cliente);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putParcelableArrayListExtra("clientes", clientes);
//        intent.putExtra("cliente", cliente); //parei aqui


//        ArrayList<Cliente> clientes = new ArrayList<>();
//        clientes.add(cliente);
//        intent.putParcelableArrayListExtra("clientes", clientes);




//        String message = txtCliente.getText().toString();
//
//        intent.putExtra("MESSAGE", message);
        setResult(RESULT_OK, intent);


        //encerra activity
        finish();
    }
}
