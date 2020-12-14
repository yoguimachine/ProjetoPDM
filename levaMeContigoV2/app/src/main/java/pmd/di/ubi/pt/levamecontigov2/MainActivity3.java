package pmd.di.ubi.pt.levamecontigov2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    ImageButton mytkn, othertkn, collection;
    Animation anim;
    public static final String USERNAME = "pmd.di.ubi.pt.levamecontigov2.extra.USERNAME";
    public static final String ID = "pmd.di.ubi.pt.levamecontigov2.extra.ID";
    public String username;
    public String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mytkn = (ImageButton)findViewById(R.id.mytoken);
        othertkn = (ImageButton)findViewById(R.id.othertokens);
        collection = (ImageButton)findViewById(R.id.collection);

        anim = AnimationUtils.loadAnimation(this, R.anim.leva_me_animation);
        mytkn.startAnimation(anim);
        othertkn.startAnimation(anim);
        collection.startAnimation(anim);

        mytkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mytkn.setImageResource(R.drawable.my_t2);
                Intent token = new Intent(MainActivity3.this, MainActivity4.class);
                token.putExtra(USERNAME, username);
                token.putExtra(ID, id);
                startActivity(token);
            }
        });

        othertkn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                othertkn.setImageResource(R.drawable.other_t2);
                Intent get = new Intent(MainActivity3.this, MainActivity6.class);
                startActivity(get);
            }
        });

        collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                collection.setImageResource(R.drawable.collection_2);
                Intent collection = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(collection);
            }
        });


    }
}