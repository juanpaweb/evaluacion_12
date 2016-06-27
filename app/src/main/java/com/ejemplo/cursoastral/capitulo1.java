package com.ejemplo.cursoastral;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class capitulo1 extends AppCompatActivity {

    WebView  wbastral;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capitulo1);

            //buscar adview recurso y cargar la solicitud

            AdView adView = (AdView) this.findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            adView.loadAd(adRequest);

            wbastral = (WebView) findViewById (R.id.webview1);

            wbastral.loadUrl("http://oroconsultores.com/astral/");
            wbastral.setVerticalScrollBarEnabled(true);
            wbastral.setHorizontalScrollBarEnabled(true);


    }
}
