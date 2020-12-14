package pmd.di.ubi.pt.levamecontigov2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    ImageButton regressar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView nome = findViewById(R.id.nome);
        TextView identificador = findViewById(R.id.id);

        Intent token = getIntent();
        String username = token.getStringExtra(MainActivity3.USERNAME);
        String id = token.getStringExtra(MainActivity3.ID);

        nome.setText(username);
        identificador.setText(id);

        regressar=(ImageButton)findViewById(R.id.returnHome);
        regressar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regressar.setImageResource(R.drawable.regressar2);
            }
            //TODO Carlos atualizacao do token
            //TODO Nuno Fonso, pasta de notificoes, Carlos meter as alteracoes nas notificaçoes
        });

    }
}