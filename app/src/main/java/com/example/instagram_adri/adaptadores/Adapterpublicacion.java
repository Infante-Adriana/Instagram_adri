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


public class Adapterpublicacion extends RecyclerView.Adapter<Adapterpublicacion.ViewHolder> implements View.OnClickListener  {

    LayoutInflater inflater;
  ArrayList<publica> mo;

    //Listener

    private View.OnClickListener listener;

    public Adapterpublicacion(Context context, ArrayList<publica> mo){

        this.inflater = LayoutInflater.from(context);
        this.mo = mo;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_publi, parent, false);
        view.setOnClickListener(this);

        return new ViewHolder(view);
    }

    public void setOnClickLister(View.OnClickListener listener){

        this.listener = listener;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        int imgpublicacion = mo.get(position).getImagenpublica();
        holder.imgpublicacion.setImageResource(imgpublicacion);
    }

    @Override
    public int getItemCount() {
        return mo.size();
    }

    @Override
    public void onClick(View view) {

        if(listener!=null){

            listener.onClick(view);

        }

    }


    public class ViewHolder extends RecyclerView.ViewHolder{


        ImageView  imgpublicacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgpublicacion = itemView.findViewById(R.id.imageView4);
        }
    }
}
