package com.flowplayer.demo.model;

import java.util.ArrayList;

public class EntryFactory {
    private EntryFactory(){}

    public static ArrayList<Entry> getDefaultEntries(){
        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry("A major product update", "A milestone on our journey to build online video that actually works.", "https://flowplayer.com/blog/major-product-update/thumb.png"));
        entries.add(new Entry("Better live streaming", "Livestreaming used to be hard, but not anymore.", "https://flowplayer.com/blog/improved-live-streaming/thumb.jpg"));
        entries.add(new Entry("Flowplayer \"Native\"", "In 2016 we set out to build a player that shakes the common understanding of online video.", "https://flowplayer.com/blog/flowplayer-native/hero.png"));
        entries.add(new Entry("Improved analytics", "Bunch of important updates to our analytics to give a better idea how your audience engages with your videos.", "https://flowplayer.com/blog/improved-video-analytics/analytics-hero-big.png"));
        entries.add(new Entry("Ad scheduling", "A powerful way to manage large-scale  advertising inventory", "https://flowplayer.com/blog/ad-schedules/thumb.png"));

        return entries;
    }
}
