# chromium-aw

[Chromium](https://www.chromium.org) based Android WebView engine to be embedded in Ridibooks-Android

## Build instructions

### Build AAR (Androd Archive)

```sh
$ ./gradlew assembleRelease
```

### Build sources JAR

```sh
$ ./gradlew sourcesJar
```

## Usage

1. Copy `chromium-aw-release.aar` file to your project(You can find the latest release [here](https://github.com/ridi-viewer/chromium-aw/releases)).

2. Add dependency script to `build.gradle` file of your project.

```
dependencies {
    ...
    implementation files('/path/to/chromium-aw-release.aar')
    ...
}
```

## Chromium build information

Current version is based on [`62.0.3202.101`](https://chromium.googlesource.com/chromium/src.git/+/0971c880c3f82e5fdbc6d65d1fc4d8ae9aa47ddc)

### Customizing

#### Native libraries

Patch files are [here](patches).

- Unix domain socket name prefix for Devtools is changed.
- V8 snapshot is disabled.
  - File names of snapshot binary might be same across architectures.

#### Java

- Browser process' private data directory suffix is changed [here](src/main/java/org/chromium/android_webview/AwBrowserProcess.java#L49).

### Build instructions

#### References

- [Checking out and building Chromium for Android](https://chromium.googlesource.com/chromium/src/+/master/docs/android_build_instructions.md)
- [Build Instructions(Android WebView)](https://www.chromium.org/developers/how-tos/build-instructions-android-webview)
- [GN build configuration](https://www.chromium.org/developers/gn-build-configuration)

#### Build steps

```sh
$ git checkout ...

$ gclient sync

$ gn gen --args='target_os="android" target_cpu="$TARGET" is_debug=false' out/$TARGET

$ ninja -C out/$TARGET webview_instrumentation_apk
```

In this project `$TARGET` must be one of `arm`, `arm64`, `x86`.

After building, there will be `out/$TARGET/libstandalonelibchromiumwebview.so`, `out/$TARGET/libdrawgl.so`.

## License

See [LICENSE](LICENSE) file from Chromium project.
