# Android-Simple-MjpegViewer

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
