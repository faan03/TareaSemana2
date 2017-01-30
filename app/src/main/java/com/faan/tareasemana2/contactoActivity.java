package com.faan.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class contactoActivity extends AppCompatActivity {

    private EditText Enombre,Etelefono, Eemail,Edescripcion;
    private DatePicker dP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Enombre= (EditText) findViewById(R.id.editNombre);
        Etelefono =(EditText) findViewById(R.id.editTelefono);
        Eemail =(EditText) findViewById(R.id.editEmail);
        Edescripcion =(EditText) findViewById(R.id.editDescripcion);
        dP =(DatePicker) findViewById(R.id.fechaPicker);

        if( getIntent() != null &&  getIntent().getExtras() !=null ) {
            Bundle parametros  = getIntent().getExtras();
            String nombre = parametros.getString("pNombre");
            String telefono = parametros.getString("pTelefono");
            String email = parametros.getString("pEmail");
            String descripcion = parametros.getString("pDescripcion");
          //  String fecha = parametros.getString("pFecha");
            Enombre.setText(nombre);
            Etelefono.setText(telefono);
            Eemail.setText(email);
            Edescripcion.setText(descripcion);


        }

    }

    public void cargarActividad2(View v)
    {
        Intent i = new Intent(this, Activity_2.class);
        i.putExtra("pNombre",Enombre.getText().toString());
        i.putExtra("pTelefono",Etelefono.getText().toString());
        i.putExtra("pEmail",Eemail.getText().toString());
        i.putExtra("pDescripcion",Edescripcion.getText().toString());
        i.putExtra("pFecha",dP.getDayOfMonth()+" / " + dP.getMonth() + " / " + dP.getYear());
        startActivity(i);
    }
}
