package com.example.jokes;
import android.graphics.Color;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnNextJoke;
    private TextView textJoke;
    private Joke[] jokesArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
            jokesArray=new Joke[]{
                    new Joke("elso vicc","szamozott vicc"),
                    new Joke("masodik vicc","szamozott vicc"),
                    new Joke("harmadik vicc","szamozott vicc"),
                    new Joke("szia vicc","uj vicc"),
                    new Joke("helo vicc","uj vicc"),
                    new Joke("ati vicc","nev vicc"),
                    new Joke("satya vicc","nev vicc"),
            };


        btnNextJoke = findViewById(R.id.btnNextJoke);
        textJoke = findViewById(R.id.textJoke);
    }

    int lepes=0;

    public void next(View v) {
        textJoke.setText(jokesArray[lepes].getJokeText());
        for(int i=0; i<lepes; i++){
            textJoke.setText(jokesArray[lepes].getJokeText());
        }
        lepes++;

    }
}