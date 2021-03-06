package pmd.di.ubi.pt.levamecontigov2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    ImageButton regressar, stats, notif;
    Animation anim;
    ImageView mytoken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView nome = findViewById(R.id.nome);
        TextView identificador = findViewById(R.id.id);
        mytoken=(ImageView)findViewById(R.id.collection);
        notif=(ImageButton)findViewById(R.id.notifs);
        stats=(ImageButton)findViewById(R.id.stats);
        stats.setVisibility(View.INVISIBLE);

        Intent token = getIntent();
        DBL database = new DBL(this);
        List<String> user_id = new ArrayList<String> () ;
        user_id=database.tokencheck();
        nome.setText(user_id.get(0));
        identificador.setText(user_id.get(1));

        anim = AnimationUtils.loadAnimation(this, R.anim.anim3);

        regressar=(ImageButton)findViewById(R.id.returnHome);
        notif=(ImageButton)findViewById(R.id.notifs);
        regressar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regressar.setImageResource(R.drawable.regressar2);
            }
            //TODO Carlos atualizacao do token
            //TODO Nuno Fonso, pasta de notificoes, Carlos meter as alteracoes nas notificaçoes
        });

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notif.setImageResource(R.drawable.notifs2);
            }
            //TODO Carlos atualizacao do token
            //TODO Nuno Fonso, pasta de notificoes, Carlos meter as alteracoes nas notificaçoes
        });

        mytoken.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    stats.setVisibility(View.VISIBLE);
                    stats.startAnimation(anim);
                }else{}
                return true;
            }
        });



        anim = AnimationUtils.loadAnimation(this, R.anim.anim3);

        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stats.setImageResource(R.drawable.stats2);
            }
        });

        notif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notif.setImageResource(R.drawable.notifs2);
            }
        });
    }

    @Override
    public void onResume () {
        super.onResume();
        regressar.setImageResource(R.drawable.regressar);
        notif.setImageResource(R.drawable.notifs);
    }
}
