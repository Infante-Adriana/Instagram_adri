package com.example.instagram_adri;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.instagram_adri.Publicaciones.Publicacion;
import com.example.instagram_adri.adaptadores.AdapterPublicaciones;

import java.util.ArrayList;


public class Fragment_inicio extends Fragment {
    AdapterPublicaciones adapterPublicaciones;
    RecyclerView recyclerView;
    ArrayList<Publicacion> listaPublicacion;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_inicio,container,false);
        recyclerView = view.findViewById(R.id.RecyclerView);
        listaPublicacion = new ArrayList<>();
        cargarLista();
        mostarData();

        return view;
    }

    public void cargarLista(){
        listaPublicacion.add(new Publicacion("alberto","Frases ❤️\uD83D\uDC69\u200D\uD83D\uDC67",R.drawable.amix,R.drawable.publi));
        listaPublicacion.add(new Publicacion("ibette","Feliz dia del amor y la amistad",R.drawable.ibett,R.drawable.patr));
        listaPublicacion.add(new Publicacion("diego","❤",R.drawable.dieg,R.drawable.cuyo));
        listaPublicacion.add(new Publicacion("jorge","",R.drawable.pa2,R.drawable.pa));
        listaPublicacion.add(new Publicacion("luis","",R.drawable.lu2,R.drawable.lu1));
        listaPublicacion.add(new Publicacion("adriana","La vida está llena de momentos, unos más agradables que otros, unos más memorables que otros y unos más pasajeros que otros… pero todos los momentos que vivamos, vivámoslos en plenitud, al máximo, intentando disfrutar de ellos.",R.drawable.a1,R.drawable.a2));


    }

    public void mostarData(){

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapterPublicaciones = new AdapterPublicaciones(getContext(),listaPublicacion);
        recyclerView.setAdapter(adapterPublicaciones);

    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_inicio() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_inicio.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_inicio newInstance(String param1, String param2) {
        Fragment_inicio fragment = new Fragment_inicio();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


}