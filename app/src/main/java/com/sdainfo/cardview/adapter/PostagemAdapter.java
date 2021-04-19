package com.sdainfo.cardview.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sdainfo.cardview.R;
import com.sdainfo.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyVielHoder> {

    private List<Postagem> lista;
    public PostagemAdapter(List<Postagem> p) {
        this.lista = p;
    }

    @NonNull
    @Override
    public MyVielHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View listaItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe, parent, false);

        return new MyVielHoder(listaItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVielHoder holder, int position) {
         Postagem p = lista.get(position);
        holder.nome.setText(p.getNome());
        holder.postagem.setText(p.getComentario());
        holder.imageView.setImageResource(p.getImagem());
    }

    @Override
    public int getItemCount() {
        return lista.size() ;
    }

    public class MyVielHoder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imageView;


        public MyVielHoder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textViewNome);
            postagem = itemView.findViewById(R.id.textView_comentario);
            imageView = itemView.findViewById(R.id.iamge_view_postagem);
        }
    }



}