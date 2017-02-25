# Android-Simple-MjpegViewer
[![](https://jitpack.io/v/dydwo92/Android-Simple-MjpegViewer.svg)](https://jitpack.io/#dydwo92/Android-Simple-MjpegViewer)

# Installation
**Step1.** Add it in your root build.gradle at the end of repositories

```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```

**Step2.** Add the dependency in your module build.gradle


```gradle
dependencies {
    com.github.dydwo92:Android-Simple-MjpegViewer:0.0'
}
```

**Step 3.** Build your project through **`Build > Make Project`**. And then, sync your project through **`Tools > Android > Sync Project with Gradle Files`**

**Step 4.** In **AndroidManifest.xml** in your app, add the following line to access internet.

```xml
<manifest ...>
    <uses-permission android:name="android.permission.INTERNET" />
```

Also, add the following tag. It will prevent video reloading when screen rotating.

```xml
<activity
    ...
    android:configChanges="orientation|screenSize"
>
```

# Usage
**Add MjpegViewer component.** In the layout xml, put the MjpegView tag.
```xml
    <MjpegViewer.MjpegView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/videwView" />
```

**Start video streaming.** In the activity class, start the video streaming.
```java
public class MainActivity extends AppCompatActivity {
    MjpegView mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mv = (MjpegView) findViewById(R.id.videwView);
        
        // By the time you do this, the mjpeg stream url below may not work..
        mv.Start("http://webcam.st-malo.com/axis-cgi/mjpg/video.cgi?resolution=352x288");
    }
}
```
<img src="http://i.imgur.com/8FXyqLZ.jpg" width="300px" />
