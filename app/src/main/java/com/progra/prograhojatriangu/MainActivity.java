package com.progra.prograhojatriangu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText T1,T2,T3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        T1 = (EditText)findViewById(R.id.TextA);
        T2 = (EditText)findViewById(R.id.TextB);
        T3 = (EditText)findViewById(R.id.TexHipotenusa);

}
    public void Operacion(View view){

        String valor1 = T1.getText().toString();
        String valor2 = T2.getText().toString();

        int valor_entero1 = Integer.parseInt(valor1);
        int valor_entero2 = Integer.parseInt(valor2);

        int a = (int) Math.pow(valor_entero1,2);
        int b = (int) Math.pow(valor_entero2,2);

        int sumar = (int) a+b;

        int raiz = (int) Math.sqrt(sumar);

        String resultado = String.valueOf(raiz);
        T3.setText(resultado);

    }
}