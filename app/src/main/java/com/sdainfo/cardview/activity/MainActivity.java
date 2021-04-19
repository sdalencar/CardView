package com.sdainfo.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sdainfo.cardview.R;
import com.sdainfo.cardview.adapter.PostagemAdapter;
import com.sdainfo.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Postagem> listaPostagem = new ArrayList<Postagem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewpostagem);

        //layout //possivel usar Linear e setar a orientacao, como gridLayout
        RecyclerView.LayoutManager layoutManager =  new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //adapter
        this.postagem();
        PostagemAdapter postagemAdapter =  new PostagemAdapter(listaPostagem);
        recyclerView.setAdapter(postagemAdapter);

    }

    public void postagem(){
        Postagem p = new Postagem("Mariane","Muito bom", R.drawable.imagem2);
        this.listaPostagem.add(p);

        p = new Postagem("Isa","Daora",R.drawable.imagem3);
        listaPostagem.add(p);

        p = new Postagem("Duda","legal",R.drawable.imagem1);
        listaPostagem.add(p);

        p = new Postagem("Mariane","Muito bom",R.drawable.imagem2);
        listaPostagem.add(p);

        p = new Postagem("Sérgio","Faltou a coca",R.drawable.imagem4);
        listaPostagem.add(p);

    }


}