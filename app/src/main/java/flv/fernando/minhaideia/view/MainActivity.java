package flv.fernando.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import flv.fernando.minhaideia.R;
import flv.fernando.minhaideia.controller.ClienteController;
import flv.fernando.minhaideia.core.AppUtil;
import flv.fernando.minhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {

    TextView txtNome;
    ClienteController clienteController;
    //Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtil.TAG, "onCreate: Tela Principal");

        Bundle bundle = getIntent().getExtras();
        //Log.d(this.TAG, "onCreate: Nome...." + bundle.getString("nome"));
        Log.d(AppUtil.TAG, "onCreate: Email...." + bundle.getString("email"));

        this.txtNome = findViewById(R.id.txtNome);
        this.txtNome.setText(bundle.getString("nome"));

        //this.contexto = getApplication(); // ou this
        this.clienteController = new ClienteController(getApplication());

    }
}