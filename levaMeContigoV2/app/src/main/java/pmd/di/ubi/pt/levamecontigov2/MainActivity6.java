package pmd.di.ubi.pt.levamecontigov2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {

    ImageView collection, collection2, collection3, collection4, collection5, collection6, collection7, collection8, collection9, collection10, collection11, collection12, collection13, collection14, collection15;
    ImageButton trocar;
    Animation anim;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main6);
        collection=(ImageView)findViewById(R.id.collection);
        collection2=(ImageView)findViewById(R.id.collection2);
        collection3=(ImageView)findViewById(R.id.collection3);
        collection4=(ImageView)findViewById(R.id.collection4);
        collection5=(ImageView)findViewById(R.id.collection5);
        collection6=(ImageView)findViewById(R.id.collection6);
        collection7=(ImageView)findViewById(R.id.collection16);
        collection8=(ImageView)findViewById(R.id.collection8);
        collection9=(ImageView)findViewById(R.id.collection9);
        collection10=(ImageView)findViewById(R.id.collection10);
        collection11=(ImageView)findViewById(R.id.collection11);
        collection12=(ImageView)findViewById(R.id.collection12);
        collection13=(ImageView)findViewById(R.id.collection13);
        collection14=(ImageView)findViewById(R.id.collection14);
        collection15=(ImageView)findViewById(R.id.collection15);

        trocar = (ImageButton)findViewById(R.id.trocar);
            trocar.setVisibility(View.INVISIBLE);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim3);
        collection.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection.setImageResource(R.drawable.possible2);
                }else
                    collection.setImageResource(R.drawable.possible);
                return true;
            }
        });


        collection2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection2.setImageResource(R.drawable.possible2);
                }else
                    collection2.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection3.setImageResource(R.drawable.possible2);
                }else
                    collection3.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection4.setImageResource(R.drawable.possible2);
                }else
                    collection4.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection5.setImageResource(R.drawable.possible2);
                }else
                    collection5.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection6.setImageResource(R.drawable.possible2);
                }else
                    collection6.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection7.setImageResource(R.drawable.possible2);
                }else
                    collection7.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection8.setImageResource(R.drawable.possible2);
                }else
                    collection8.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection9.setImageResource(R.drawable.possible2);
                }else
                    collection9.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection10.setImageResource(R.drawable.possible2);
                }else
                    collection10.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection11.setImageResource(R.drawable.possible2);
                }else
                    collection11.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection12.setImageResource(R.drawable.possible2);
                }else
                    collection12.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection13.setImageResource(R.drawable.possible2);
                }else
                    collection13.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection14.setImageResource(R.drawable.possible2);
                }else
                    collection14.setImageResource(R.drawable.possible);
                return true;
            }
        });

        collection15.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    trocar.setVisibility(View.VISIBLE);
                    trocar.startAnimation(anim);
                    collection15.setImageResource(R.drawable.possible2);
                }else
                    collection15.setImageResource(R.drawable.possible);
                return true;
            }
        });

    }
}