package com.example.nicol;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2;
    TextView tv1;
    Button btnSumar;
    Button btnRestar;
    Button btnMultiplicar;
    Button btnDividir;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =(EditText) findViewById(R.id.txtNumero1);
        et2 =(EditText) findViewById(R.id.txtNumero2);
        tv1 = (TextView)findViewById(R.id.lblResultado);
        btnSumar =(Button)findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(this);
        et1 =(EditText) findViewById(R.id.txtNumero1);
        et2 =(EditText) findViewById(R.id.txtNumero2);
        tv1 = (TextView)findViewById(R.id.lblResultado);
        btnRestar =(Button)findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(this);
        et1 =(EditText) findViewById(R.id.txtNumero1);
        et2 =(EditText) findViewById(R.id.txtNumero2);
        tv1 = (TextView)findViewById(R.id.lblResultado);
        btnMultiplicar =(Button)findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(this);
        et1 =(EditText) findViewById(R.id.txtNumero1);
        et2 =(EditText) findViewById(R.id.txtNumero2);
        tv1 = (TextView)findViewById(R.id.lblResultado);
        btnDividir =(Button)findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    float n1, n2, res;
    n1= Float.parseFloat(et1.getText().toString());
    n2= Float.parseFloat(et2.getText().toString());
    res = n1 + n2;
    tv1.setText("El Res es "+res);
    Toast.makeText(getApplicationContext(), "El Res es "+res, Toast.LENGTH_LONG).show();

    float nu1, nu2, resu;
    nu1= Float.parseFloat(et1.getText().toString());
    nu2= Float.parseFloat(et2.getText().toString());
    resu = nu1 - nu2;
    tv1.setText("El Resu es "+res);
    Toast.makeText(getApplicationContext(), "El Resu es "+res, Toast.LENGTH_LONG).show();

    float num1, num2, resul;
    num1= Float.parseFloat(et1.getText().toString());
    num2= Float.parseFloat(et2.getText().toString());
    resul = num1 * num2;
    tv1.setText("El Resul es "+res);
    Toast.makeText(getApplicationContext(), "El Resul es "+res, Toast.LENGTH_LONG).show();

    float nume1, nume2, resulta;
    nume1= Float.parseFloat(et1.getText().toString());
    nume2= Float.parseFloat(et2.getText().toString());
    resulta = nume1 / nume2;
    tv1.setText("El Resulta es "res);
    Toast.makeText(getApplicationContext(), "el resulta es "+res, Toast.LENGTH_LONG).show();
    }
}