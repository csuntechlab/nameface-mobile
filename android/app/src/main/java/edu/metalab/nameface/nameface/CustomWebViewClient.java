package edu.metalab.nameface.nameface;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CustomWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        // let the application capture all the urls that end in app_url_tld
        // otherwise the OS will prompt us to pick a browser
        if(Uri.parse(url).getHost().contains(String.valueOf(R.string.app_url_tld))) {
            return false;
        }
        return true;
    }
}
