package pmd.di.ubi.pt.levamecontigov2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity7 extends AppCompatActivity {

    ImageButton troca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        troca = (ImageButton)findViewById(R.id.returnHome);

        troca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                troca.setImageResource(R.drawable.trocar2);
            }
        });
    }
}