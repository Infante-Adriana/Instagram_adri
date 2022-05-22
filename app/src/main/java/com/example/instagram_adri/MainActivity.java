package com.example.instagram_adri;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //fragment default
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayout, new Fragment_inicio())
                .commit();
    }

    //metodos para reemplazar fragments
    public void mostrarinicio(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_inicio()).commit();
    }
    public void mostrarperfill(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_perfil()).commit();
    }


    public void mostrarbusqueda(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_buscar()).commit();
    }
    public void mostrarreelss(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_reels()).commit();
    }
    public void mostrarmensaje(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_mensaje()).commit();
    }
    public void mostrarmas(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new Fragment_menu()).commit();
    }

}