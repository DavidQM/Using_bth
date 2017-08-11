package com.example.vijosame.using_bth;

import android.bluetooth.BluetoothAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    BluetoothAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen=(ImageView)findViewById(R.id.blue);
        adaptador=BluetoothAdapter.getDefaultAdapter();
        if (adaptador==null){
            imagen.setVisibility(View.GONE);
        }
        else{
            setimageblue(adaptador.isEnabled());}
    }


    public void click_imagen(View v){
        setestadoblue();}
    public void setimageblue(boolean valor)
    {
        if (valor)imagen.setImageResource(R.drawable.blue);
        else imagen.setImageResource(R.drawable.blue2);
    }
    public void setestadoblue()
    {
        if(adaptador.isEnabled()){
            setimageblue(false);
            adaptador.disable();
        }
        else{
            setimageblue(true);
            adaptador.enable();
        }
    }

}
