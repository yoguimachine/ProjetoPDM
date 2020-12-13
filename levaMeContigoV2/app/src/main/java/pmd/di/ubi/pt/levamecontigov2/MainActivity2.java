package pmd.di.ubi.pt.levamecontigov2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallations;

import javax.xml.transform.Result;

public class MainActivity2 extends AppCompatActivity {

    ImageView title, user;
    Animation titleanimation;
    EditText usertxt;
    ImageButton startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        title = (ImageView)findViewById(R.id.title);
        user = (ImageView)findViewById(R.id.user);
        startBtn = (ImageButton) findViewById(R.id.startBtn);
        usertxt = (EditText) findViewById(R.id.usertxt);

        titleanimation = AnimationUtils.loadAnimation(this, R.anim.titleanim);
        title.startAnimation(titleanimation);

        user.startAnimation(titleanimation);

        usertxt.startAnimation(titleanimation);

        startBtn.setOnClickListener(v -> geraToken());

    }

    public void geraToken(){
        startBtn.setImageResource(R.drawable.app_btnstart2);
        Token myToken = new Token();
        String auxUsername = usertxt.getText().toString();
        Task<String> idTask = FirebaseInstallations.getInstance().getId();
        myToken.setId(idTask.toString());
        //Toast check =  new Toast();
        myToken.setUsername(auxUsername);
        DBL database = new DBL(this);
        database.addToken(myToken.getUsername().get(0), myToken.getId());
        Intent userMenu = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(userMenu);
    }

}
