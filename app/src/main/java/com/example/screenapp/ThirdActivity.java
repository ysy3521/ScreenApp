package com.example.screenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ThirdActivity extends AppCompatActivity implements OnMapReadyCallback {

    private Button act3_1, act3_2;
    private GoogleMap mMap;
    private LatLng school;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        act3_1 = findViewById(R.id.act3_1);
        act3_2 = findViewById(R.id.act3_2);

        act3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        act3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        assert mapFragment != null;
        mapFragment.getMapAsync(this);
    }

    // NULL이 아닌 GoogleMap 객체를 파라미터로 제공해 줄 수 있을 때 호출
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        school = new LatLng(35.8, 128.6);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(school);
        markerOptions.title("경북대학교");
        markerOptions.snippet("학교");

        mMap.addMarker(markerOptions);

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(school, 10));
        String serviceUrl =
                "http://apis.data.go.kr/B552584/ArpltnStatsSvc";
        String serviceKey =
                "A8zzd1hDcdvX%2FdquqkhFJbwQpnVuoqQEwLrHkyEzsmGRQl48dNZRdmp1qfTzMyUjYBsEoewQMhLp5wFE51kIjg%3D%3D";
        String api ="https://apis.data.go.kr/B552584/ArpltnStatsSvc/getCtprvnMesureLIst?serviceKey=A8zzd1hDcdvX%2FdquqkhFJbwQpnVuoqQEwLrHkyEzsmGRQl48dNZRdmp1qfTzMyUjYBsEoewQMhLp5wFE51kIjg%3D%3D&returnType=xml&numOfRows=1&pageNo=1&itemCode=PM10&dataGubun=HOUR&searchCondition=MONTH";


    }

}