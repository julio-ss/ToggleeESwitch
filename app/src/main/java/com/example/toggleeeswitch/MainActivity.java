package com.example.toggleeeswitch;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

    public void abrirDialog(View v){
        //instanciar AlertDialog
        AlertDialog .Builder dialog = new AlertDialog.Builder(this);

        //configurar titulo e mensagem
        dialog.setTitle("Titulo da dialog");
        dialog.setMessage("Mensagem da dialog");

        //configurar cancelamento
        dialog.setCancelable(false);

        //configurar icone
        dialog.setIcon(android.R.drawable.btn_star_big_on);

        //configurar acoes de sim e nao
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Executar acao ao clicar no botao sim", Toast.LENGTH_LONG).show();
            }
        });

        dialog.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Execeutar acao ao clicar no botao nao", Toast.LENGTH_LONG).show();
            }
        });

        //criar e exibir AlertDialog
        dialog.create();
        dialog.show();
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