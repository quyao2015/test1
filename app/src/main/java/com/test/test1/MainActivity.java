package com.test.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {



        private ImageView imageView;
        private Button button;
        private Button button2;
        @Override        protected  void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_main);
            button = (Button) findViewById(R.id.button);
            button2 = (Button) findViewById(R.id.button2);
            imageView = (ImageView) findViewById(R.id.imageView);
            button.setOnClickListener(this);
            button2.setOnClickListener(this);

        }
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.button:
                        imageView.setImageResource(R.mipmap.shulin);
                        break;
                    case R.id.button2:
                        Intent intent = new Intent(MainActivity.this,TwoActivity.class);
                        startActivity(intent);
                        break;

                    default:
                        break;

                }

            }



        }






