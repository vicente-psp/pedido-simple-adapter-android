package br.com.student.pedido_simple_adapter_android.atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.com.student.pedido_simple_adapter_android.R;

public class ClienteActivity extends AppCompatActivity {

    EditText txtTeste;
            
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
    }

    public void testar(View view){
        txtTeste = findViewById(R.id.txtMessage);
        String message = txtTeste.getText().toString();
        Intent intent=new Intent();
        intent.putExtra("MESSAGE",message);
        setResult(RESULT_OK,intent);

        //encerra activity
        finish();
    }
}
