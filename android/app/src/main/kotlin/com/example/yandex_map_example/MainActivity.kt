package com.example.yandex_map_example

import io.flutter.embedding.android.FlutterActivity

import android.app.Application

import com.yandex.mapkit.MapKitFactory

class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("") // Your generated API key
    }
}
