package br.com.student.pedido_simple_adapter_android.atividades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.student.pedido_simple_adapter_android.R;
import br.com.student.pedido_simple_adapter_android.entidades.Cliente;

public class ClienteActivity extends AppCompatActivity {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    ListView simpleListView;
    private int ultimoId;
            
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        simpleListView = findViewById(R.id.listViewCliente);
        Intent intent = getIntent();
        ultimoId = intent.getIntExtra("ultimoId", 0);
        Toast.makeText(this, "ultimoId: " + ultimoId, Toast.LENGTH_LONG).show();
    }

    public void adicionar(View view){
        EditText txtNome = findViewById(R.id.txtNome);
        Cliente cliente = new Cliente(ultimoId + 1, txtNome.getText().toString());
        clientes.add(cliente);

        String[] from = {"id", "nome"};
        int[] to = {R.id.cliente_item_id, R.id.cliente_item_nome};

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("id", String.valueOf(cliente.getId()));
        hashMap.put("nome", cliente.getNome());
        arrayList.add(hashMap);

        simpleListView.setAdapter(new SimpleAdapter(this, arrayList, R.layout.activity_cliente_item, from, to));
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
