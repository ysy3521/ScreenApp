package com.example.screenapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;


import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Gallery extends Fragment {

    private ImageView img1, img2, img3, img4;

    public  Gallery(){

    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        ViewGroup rootview = (ViewGroup) inflater.inflate(R.layout.fragment_gallery,container,false);

        img1 = (ImageView) rootview.findViewById(R.id.img1);
        img2 = (ImageView) rootview.findViewById(R.id.img2);
        img3 = (ImageView) rootview.findViewById(R.id.img3);
        img4 = (ImageView) rootview.findViewById(R.id.img4);

        img1.setImageResource(R.drawable.pic1);
        img2.setImageResource(R.drawable.pic2);
        img3.setImageResource(R.drawable.pic3);
        img4.setImageResource(R.drawable.pic4);

        return rootview;
    }

}
