package com.example.alc40androidchallenge1;

import android.app.ProgressDialog;
import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
     WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);


        Toolbar toolbar = findViewById(R.id.toolbar_web);
       toolbar.setTitle(R.string.abt_alc_name);
        toolbar.setTitleTextAppearance(AboutALC.this, R.style.alconica);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        mWebView = findViewById(R.id.alc_webview);
        mWebView.setWebViewClient(new WebViewClient());

//        mWebView.loadUrl("https://teamtreehouse.com/");
       // mWebView.loadUrl("https://www.youtube.com/");
       // mWebView.loadUrl("https://www.google.com/");
       // mWebView.loadUrl("https://www.youtube.com/");



       mWebView.loadUrl("https://andela.com/alc/");
       WebSettings webSettings = mWebView.getSettings();
       webSettings.setJavaScriptEnabled(true);

       mWebView.setWebViewClient(new WebViewClient() {
           @Override
           public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
               handler.proceed();
           }
       });

    }

}
