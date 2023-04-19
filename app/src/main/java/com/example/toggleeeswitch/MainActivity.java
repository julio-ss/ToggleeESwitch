package com.example.toggleeeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textView = findViewById(R.id.textResultado);

        adicionarListener();

    }

    public void adicionarListener(){
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    textView.setText("Switch Ligado");
                }else{
                    textView.setText("Switch Desligado");
                }
            }
        });

        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    textView.setText("Toggle ligado");
                }else{
                    textView.setText("Toggle desligado");
                }

            }
        });
    }

    public void enviar(View v){

       /* if(toggleSenha.isChecked()){
            textView.setText("Toggle ligado");
        }else{
            textView.setText("Toggle desligado");
        }*/

        if(switchSenha.isChecked()){
            textView.setText("Switch ligado");
        }else{
            textView.setText("Switch desligado");
        }
    }
}