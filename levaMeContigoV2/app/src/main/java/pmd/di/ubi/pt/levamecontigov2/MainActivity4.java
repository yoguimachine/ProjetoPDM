package pmd.di.ubi.pt.levamecontigov2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    ImageButton regressar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        regressar=(ImageButton)findViewById(R.id.returnHome);
        regressar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regressar.setImageResource(R.drawable.regressar2);
            }
        });

    }
}