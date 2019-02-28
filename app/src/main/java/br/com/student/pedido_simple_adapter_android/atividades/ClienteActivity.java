package br.com.student.pedido_simple_adapter_android.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import br.com.student.pedido_simple_adapter_android.entidades.Cliente;

import br.com.student.pedido_simple_adapter_android.R;

public class ClienteActivity extends AppCompatActivity {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    ListView simpleListView;
            
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        simpleListView = findViewById(R.id.listViewCliente);
    }

    public void adicionar(View view){
//        txtCliente = findViewById(R.id.txtCliente);
        EditText txtCliente = findViewById(R.id.txtCliente);
        clientes.add(new Cliente(txtCliente.getText().toString()));

        EditText id = findViewById(R.id.txtId);

        String[] from = {"id"};

        
//        String[] from = {"id", "nome"};
        int[] to = {R.id.item_id};
//        int[] to = {R.id.item_id, R.id.item_nome};

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("id", id.getText().toString());
//        hashMap.put("nome", nome.getText().toString());
        arrayList.add(hashMap);

        simpleListView.setAdapter(new SimpleAdapter(this, arrayList, R.layout.activity_pedido_item, from, to));
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
