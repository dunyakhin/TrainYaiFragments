package com.example.infofragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class WebFragment extends Fragment {
WebView wv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View web=inflater.inflate(R.layout.fragment_web, container,false);
        wv=web.findViewById(R.id.webFragmentView);
        wv.setWebViewClient(new WebViewClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://grandkulinar.ru/11565-50-receptov-iz-yaic.html");
        return web;
    }
}