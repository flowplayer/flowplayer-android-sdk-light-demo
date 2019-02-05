# Flowplayer Demo
Demo application using Flowplayer SDK for Android.

# Requirements

1. Minimum SDK version 16.
2. Kotlin stdlib.

# Setup

1. If you haven't already, configure Kotlin at your Android Studio project.
2. Add library dependency:

[ ![Download](https://api.bintray.com/packages/flowplayer/maven/flowplayer/images/download.svg) ](https://bintray.com/flowplayer/maven/flowplayer/_latestVersion)
```
repositories {
    maven {
        url 'https://dl.bintray.com/flowplayer/maven/'
    }
}


implementation 'com.flowplayer.flowplayer:flowplayer:#.#.#'
```

# Usage

For a detailed example, check `activity_player.xml`.

### Method 1 (via XML):

Add `Flowplayer` in your layout:

```
        <com.flowplayer.player.Flowplayer
            android:layout_width="match_parent"
            android:layout_height="320dp"
            app:fullscreenLayout="@id/fullscreenLayout"
            app:loadingView="@id/fullscreenLoadingView"
            app:mediaId="69891ec1-2d90-423c-9892-5a9ee87b6d86"
            app:nonFullscreenLayout="@id/nonFullscreenLayout"
            app:playerId="ac6dea7c-acf1-472a-bdab-efdd85f092f1" />
```

Parameter explanation:

1. `app:fullscreenLayout`: the layout that should be hidden when the player enters fullscreen.
2. `app:nonFullscreenLayout`: the layout where the player will be shown when it enters fullscreen.
3. `app:mediaId`: A Flowplayer mediaId.
4. `app:playerId` (Optional): A Flowplayer playerId.
5. `app:loadingView` (Optional): A view that will be shown while the video enters fullscreen.

### Method 2 (programmatically):

1. Create a `Flowplayer` instance with one of the available constructors.
2. Setup `fullscreenLayout`, `nonFullscreenLayout`, and, optionally, `loadingView` via `Flowplayer.setup(View nonFullscreenLayout, ViewGroup fullscreenLayout, View loadingView)`.
3. Load your media by passing a `mediaId`, and, optionally, a `playerId` via `Flowplayer.loadMedia(String mediaId, String playerId)`.
