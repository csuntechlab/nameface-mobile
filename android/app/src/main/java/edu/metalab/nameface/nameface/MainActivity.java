package edu.metalab.nameface.nameface;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {

    private WebView mWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set the view
        setContentView(R.layout.web_view);
        mWebView = findViewById(R.id.web_view);
        // set parameters of the web view
        mWebView.loadUrl(getString(R.string.app_url));
        mWebView.setWebViewClient(new CustomWebViewClient());
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        // We do this to keep the built-in ability to go back
        // as users are used to in native apps
        if (mWebView.canGoBack() && mWebView.isFocused()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}