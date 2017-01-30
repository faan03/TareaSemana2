package com.faan.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {
    private TextView tn, tt,te,td, tf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Bundle parametros  = getIntent().getExtras();
        String nombre = parametros.getString("pNombre");
        String telefono = parametros.getString("pTelefono");
        String email = parametros.getString("pEmail");
        String descripcion = parametros.getString("pDescripcion");
        String fecha = parametros.getString("pFecha");



        tn= (TextView) findViewById(R.id.txtNombre);
        tt= (TextView) findViewById(R.id.txtTelefobo);
        te= (TextView) findViewById(R.id.txtEmail);
        td= (TextView) findViewById(R.id.txtDescripcion);
        tf= (TextView) findViewById(R.id.txtFecha);

        tn.setText("Nombre :" + nombre);
        tt.setText("Tel :" + telefono);
        te.setText("Email :" + email);
        td.setText("Descripción :" + descripcion);
        tf.setText("Fecha Nacimiento :" + fecha);
    }

    public void volverActivity1(View v)
    {
        Intent i = new Intent(this, contactoActivity.class);
        i.putExtra("pNombre",tn.getText().toString());
        i.putExtra("pTelefono",tt.getText().toString());
        i.putExtra("pEmail",te.getText().toString());
        i.putExtra("pDescripcion",td.getText().toString());
       // i.putExtra("pFecha",dP.toString());
        startActivity(i);
    }
}
