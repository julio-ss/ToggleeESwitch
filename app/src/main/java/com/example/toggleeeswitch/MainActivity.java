package com.example.toggleeeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
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

    public void abrirToast(View v){

        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.btn_radio);

        TextView textRet = new TextView(getApplicationContext());
        textRet.setBackgroundResource(com.google.android.material.R.color.material_dynamic_primary40);
        textRet.setText("Ola mundo!");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(imagem);
        //toast.setView(textRet);
        toast.show();



        /*Toast.makeText(
                getApplicationContext(),
                "Acao realizada com sucesso!",
                Toast.LENGTH_LONG
        ).show();*/
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