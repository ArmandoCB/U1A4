package unam.fca.dmoviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.LocalDate;
//import java.util.Calendar;
import java.util.Date;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        if (v.getId()==findViewById(R.id.btn).getId()) {
            final TextView tv = findViewById (R.id.tv);
            Date LocalDate =  new Date();
            //Calendar LocalDate = Calendar.getInstance ();
            //LocalDate LocalDate= java.time.LocalDate.now ();
            tv.setText(LocalDate.toString());
            //tv.setText("Ultima linea");

            //LocalDateTime fecha_id =LocalDateTime.now();

            //Para cambiar el texto de tv
            //Actividades
            //a) Agrega un evento  setOnClickListener al boton como viene en la referencia
            //b) El el metodo onClick, modifica el texto de tv para que muestre la fecha actual con LocalDateTime.now().ToString()
            //c) Sube tu codigo al repositorio.
            //d) Sube un documento en word a la plataforma Moodle con las capturas de pantalla de tu actividad. Incluye la liga a tu repositorio
        }
    }
}