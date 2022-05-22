package com.example.instagram_adri;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram_adri.Publiacion.publica;
import com.example.instagram_adri.adaptadores.Adapterpublicacion;

import java.util.ArrayList;


public class Fragment_perfil extends Fragment {
    Adapterpublicacion adapterPublicacion;
    RecyclerView recyclerView;
    ArrayList<publica> listapublica;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil,container,false);
        recyclerView = view.findViewById(R.id.RecyclerView2);
         listapublica = new ArrayList<>();
        cargarListaaa();
        mostarDataa();

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        return view;
    }

    public void cargarListaaa(){
        listapublica.add(new publica(R.drawable.publi));
        listapublica.add(new publica(R.drawable.a1));
        listapublica.add(new publica(R.drawable.publi));
        listapublica.add(new publica(R.drawable.publi));
        listapublica.add(new publica(R.drawable.publi));
        listapublica.add(new publica(R.drawable.publi));


    }
    public void mostarDataa(){

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPublicacion = new Adapterpublicacion(getContext(),listapublica);
        recyclerView.setAdapter(adapterPublicacion);

    }





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


}