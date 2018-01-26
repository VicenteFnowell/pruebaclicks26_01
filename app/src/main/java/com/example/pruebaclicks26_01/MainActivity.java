package com.example.pruebaclicks26_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView etiquetafacebook, etiquetatwitter, etiquetainstagram, etiquetagoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etiquetafacebook = (TextView)findViewById(R.id.pulsafacebook);
        etiquetatwitter = (TextView)findViewById(R.id.pulsatwitter);
        etiquetainstagram = (TextView)findViewById(R.id.pulsainstagram);
        etiquetagoogle = (TextView)findViewById(R.id.pulsabotongoogle);


    etiquetafacebook.setText(R.string.facebook);
    String facebook = etiquetafacebook.getText().toString();

        etiquetatwitter.setText(R.string.twitter);
        String twitter = etiquetatwitter.getText().toString();

        etiquetainstagram.setText(R.string.instagram);
        String instagram = etiquetainstagram.getText().toString();

        etiquetagoogle.setText(R.string.google);
        String google = etiquetagoogle.getText().toString();


    }//Fin OnCreate

    public void sobreescribirFB(View view){
        etiquetafacebook.setText("Has pulsado Facebook");
    }

           public void sobreescribirTW(View view){
        etiquetatwitter.setText("Has pulsado Twitter");

    }

    public void sobreescribirINS(View view){
        etiquetainstagram.setText("Has pulsado Instagram");

    }

    public void sobreescribirGO(View view){
        etiquetagoogle.setText("Has pulsado Google+");

    }

    public void limpiartodo(View view){
        etiquetafacebook.setText("");
        etiquetainstagram.setText("");
        etiquetatwitter.setText("");
        etiquetagoogle.setText("");

    }





}//Fin Activity
