package com.example.instagram_adri.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.instagram_adri.Publiacion.publica;
import com.example.instagram_adri.Publicaciones.Publicacion;
import com.example.instagram_adri.R;


import java.util.ArrayList;


public class AdapterPublicaciones extends RecyclerView.Adapter<AdapterPublicaciones.ViewHolder> implements View.OnClickListener  {

    LayoutInflater inflater;
    ArrayList<Publicacion> model;

    //Listener

    private View.OnClickListener listener;

    public AdapterPublicaciones(Context context, ArrayList<Publicacion> model){

        this.inflater = LayoutInflater.from(context);
        this.model = model;

    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_list, parent, false);
        view.setOnClickListener(this);

        return new ViewHolder(view);
    }

    public void setOnClickLister(View.OnClickListener listener){

        this.listener = listener;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    String nombreperfil = model.get(position).getNombre();
    String descripcion = model.get(position).getDescripcion();
    int imgperfil = model.get(position).getImagenperfil();
    int imgpublicacion = model.get(position).getImagenpublicacion();
    holder.nombreperfil.setText(nombreperfil);
    holder.descripcion.setText(descripcion);
    holder.imgperfil.setImageResource(imgperfil);
    holder.imgpublicacion.setImageResource(imgpublicacion);
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public void onClick(View view) {

        if(listener!=null){

            listener.onClick(view);

        }

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombreperfil,descripcion;
        ImageView imgperfil, imgpublicacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreperfil = itemView.findViewById(R.id.nombreperfil);
            descripcion = itemView.findViewById(R.id.descripcion);
            imgperfil = itemView.findViewById(R.id.imgperfil);
            imgpublicacion = itemView.findViewById(R.id.imgpublicacion);
        }
    }
}
