package br.com.student.pedido_simple_adapter_android.atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.student.pedido_simple_adapter_android.R;

public class PedidoActivity extends AppCompatActivity {

    Spinner spinner;

    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
    ListView simpleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);

        simpleListView = findViewById(R.id.listViewPedido);
    }

    public void salvar(View view) {
        EditText id = findViewById(R.id.txtId);
//        EditText nome = findViewById(R.id.txtCliente);

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
}
