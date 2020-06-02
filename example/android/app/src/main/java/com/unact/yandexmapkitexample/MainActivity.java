package com.unact.yandexmapkitexample;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import com.yandex.mapkit.MapKitFactory;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    MapKitFactory.setApiKey("97c66e69-2230-4e76-86ef-bbe91570bede");
    GeneratedPluginRegistrant.registerWith(this);
  }
}
