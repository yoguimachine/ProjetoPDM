package pmd.di.ubi.pt.levamecontigov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    ImageButton mytkn, othertkn, menu;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mytkn = (ImageButton)findViewById(R.id.mytoken);
        othertkn = (ImageButton)findViewById(R.id.othertokens);
        menu = (ImageButton)findViewById(R.id.menu);

        anim = AnimationUtils.loadAnimation(this, R.anim.leva_me_animation);
        mytkn.startAnimation(anim);
        othertkn.startAnimation(anim);

        mytkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mytkn.setImageResource(R.drawable.my_t2);
            }
        });

        othertkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othertkn.setImageResource(R.drawable.other_t2);
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.setImageResource(R.drawable.menu2);
                Intent main = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(main);
            }
        });

    }
}