package com.v2team.allsampleapplication.Android3Tutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import com.v2team.allsampleapplication.R;

public class WebViewDemoActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_demo);
        webView = (WebView) findViewById(R.id.webView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        webView.loadUrl("https://www.quora.com/");
    }
}
