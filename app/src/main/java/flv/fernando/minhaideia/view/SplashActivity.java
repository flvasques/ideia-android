package flv.fernando.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import flv.fernando.minhaideia.R;
import flv.fernando.minhaideia.core.AppUtil;
import flv.fernando.minhaideia.model.Cliente;


public class SplashActivity extends AppCompatActivity {

    private final String TAG = "APP_MINHA_IDEIA";
    private final int TEMPO = 4000;

    Cliente cliente;

    TextView txtVersao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(AppUtil.TAG, "onCreate: Tela de Splash");
        this.proximaTela();
        this.txtVersao = findViewById(R.id.versoaApp);
        this.txtVersao.setText(AppUtil.VERSAOAPP);
    }

    private void proximaTela() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(AppUtil.TAG, "proximaTela: Trocando de tela");
                cliente = new Cliente(
                        0,
                        "Fernando Vasques",
                        "53 981362893",
                        "fflqvn@gmail.com",
                        36,
                        1
                );
                Intent trocaTela = new Intent(SplashActivity.this, MainActivity.class);
                Bundle bundleClinte = new Bundle();
                bundleClinte.putString("nome", cliente.getNome());
                bundleClinte.putString("email", cliente.getEmail());
                trocaTela.putExtras(bundleClinte);
                startActivity(trocaTela);
                finish();
            }
        }, this.TEMPO);
    }

}