package mx.aedr2.mismapasmis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private LinearLayout llEscuela;
    private LinearLayout llCentro;
    private LinearLayout llBufadora;
    private LinearLayout llPlaya;

    private double latitud;
    private double longitud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llEscuela = (LinearLayout) findViewById(R.id.llCICESE);
        llCentro = (LinearLayout) findViewById(R.id.llCentro);
        llBufadora = (LinearLayout) findViewById(R.id.llBufadora);
        llPlaya = (LinearLayout) findViewById(R.id.llPlaya);

        llEscuela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latitud = 31.869835;
                longitud = -116.667001;
                abrirMapa(latitud, longitud);
            }
        });

        llPlaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latitud = 31.835638;
                longitud = -116.610395;
                abrirMapa(latitud, longitud);
            }
        });

        llCentro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latitud = 31.873431;
                longitud = -116.612759;
                abrirMapa(latitud, longitud);
            }
        });

        llBufadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                latitud = 31.725690;
                longitud = -116.718102;
                abrirMapa(latitud, longitud);
            }
        });
    }

    private void abrirMapa(double latitud, double longitud){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra(getResources().getString(R.string.extraLatitud), latitud);
        intent.putExtra(getResources().getString(R.string.extraLongitud), longitud);
        startActivity(intent);
    }
}
