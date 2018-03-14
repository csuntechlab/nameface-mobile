# Nameface Mobile
> Mobile versions of Nameface

## Android
Dependency
+ [Android Studio](https://developer.android.com/studio/index.html)

Optional
+ [Java JRE](http://www.oracle.com/technetwork/java/javase/downloads/index.html) - for certain tools to work.

This project is set-up to point to the nameface URL. The file that drives the location of the URL is `strings.xml` which is located under
```
android/app/src/main/res/values
├── colors.xml
├── strings.xml
└── styles.xml
```
in here you will find a key called `app_url`. This value will change once the application is in production.