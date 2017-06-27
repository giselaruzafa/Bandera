package com.gigi.bandera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    Button buttonOne, buttonTwo,buttonThree;
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonTwo=(Button)findViewById(R.id.button2);
        buttonThree=(Button)findViewById(R.id.button3);
        texto=(TextView) findViewById(R.id.text1);
        buttonOne.setOnClickListener(new View.OnClickListener() {


            // alt intro en View.OnClickListener() implement metodos y te los genera
            //CNTRL +ALT + SHIFT CLICKS A LA VEZ
            // CNTRL + D DUPLICA
            @Override
            public void onClick(View v) {
                Log.v(TAG,"SOY EL BOTON 1");
            }
        });

        buttonTwo.setOnClickListener(this);
        buttonThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch ((v.getId())){
            case R.id.button1:
                Log.v(TAG,"SOY EL BOTON 1 EN THIS");
                break;
            case R.id.button2:
                Log.v(TAG,"SOY EL BOTON 2 EN THIS");
                break;
            case R.id.button3:
                Log.v(TAG,"SOY EL BOTON 3 EN THIS");
                break;

        }


    }
    public void MeHanHechoClick(View v){

        Log.v(TAG,"SOY EL BOTON 4");
    }
}
