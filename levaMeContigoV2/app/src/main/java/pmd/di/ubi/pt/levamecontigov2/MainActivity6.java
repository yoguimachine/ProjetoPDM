package pmd.di.ubi.pt.levamecontigov2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.zxing.Result;
import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class MainActivity6 extends AppCompatActivity {

    ImageButton gerar, ler;
    Animation anim;
    ImageView qrvalue;
    CodeScanner codeScanner;
    CodeScannerView scannerView;
    EditText qr;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main6);

        gerar = (ImageButton) findViewById(R.id.gerar);
        ler = (ImageButton) findViewById(R.id.ler);
        qrvalue = findViewById(R.id.qrcodeholder);
        scannerView = findViewById(R.id.scannerView);
        qr = findViewById(R.id.QR);
        scannerView.setVisibility(View.INVISIBLE);
        codeScanner = new CodeScanner(this, scannerView);


        gerar.setVisibility(View.VISIBLE);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim3);

        gerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gerar.setImageResource(R.drawable.generate2);
                //Intent troca = new Intent(MainActivity6.this, MainActivity7.class);
                //startActivity(troca);
                //TODO: ir buscar a string s à segunda entrada da base de dados que é o token que temos de momento
                String s = "1234";
                QRGEncoder qrencoder = new QRGEncoder(s, null, QRGContents.Type.TEXT, 500);
                try {
                    Bitmap qrbits = qrencoder.getBitmap();
                    qrvalue.setImageBitmap(qrbits);
                    gerar.setImageResource(R.drawable.generate);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ler.setOnClickListener(v -> checkqr());

    }

    public void checkqr() {
        ler.setImageResource(R.drawable.read2);
        scannerView.setVisibility(View.VISIBLE);
        codeScanner.startPreview();
        codeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        ler.setImageResource(R.drawable.read);
                        scannerView.setVisibility(View.INVISIBLE);
                        qr.setText(result.toString());
                        codeScanner.stopPreview();
                        scannerView.setVisibility(View.INVISIBLE);
                        codeScanner.releaseResources();
                    }
                });
            }
        });

    }
}