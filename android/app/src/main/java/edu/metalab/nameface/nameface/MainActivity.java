package edu.metalab.nameface.nameface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the view
        setContentView(R.layout.web_view);
        WebView myWebView = findViewById(R.id.web_view);
        // set parameters of the web view
        myWebView.loadUrl(String.valueOf(R.string.app_name));
        myWebView.setWebViewClient(new CustomWebViewClient());
        // Enable Javascript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
