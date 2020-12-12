package pmd.di.ubi.pt.levamecontigov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton startBtn, regBtn, menu;
    View back;
    ImageView title;
    Animation titleanimation, backanimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        back = (View)findViewById(R.id.view);
        startBtn = (ImageButton) findViewById(R.id.startBtn);
        regBtn = (ImageButton) findViewById(R.id.regBtn);
        menu = (ImageButton) findViewById(R.id.menu);
        title = (ImageView)findViewById(R.id.title);

        backanimation = AnimationUtils.loadAnimation(this, R.anim.titleanim);
        back.startAnimation(backanimation);

        titleanimation = AnimationUtils.loadAnimation(this, R.anim.leva_me_animation);
        title.startAnimation(titleanimation);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startBtn.setImageResource(R.drawable.app_btnstart2);
                Intent tokensMenu = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(tokensMenu);
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regBtn.setImageResource(R.drawable.reg_btn2);
                Intent register = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(register);
            }
        });
    }
}