package com.edmantv.howknowit.hkit_edmantv.fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class youTubeContent {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("6A2dezKH56Y", "Mariano un poco de todo"));
        addItem(new YouTubeVideo("fQA6vbbQYr8", "DIETA DE DEFINICION + ENTRENO\n"));
        addItem(new YouTubeVideo("iZRuGqEohMw", "Bodybuilding Motivation - Whatever It Takes"));
        addItem(new YouTubeVideo("iCh30Kl3vlM", "Motivación deportiva [GYM]"));
        addItem(new YouTubeVideo("qk5F6Bxqhr4", "Threading Performance"));
        addItem(new YouTubeVideo("fcWVV0Hafuk", "Keep it Secret, Keep it Safe"));
        addItem(new YouTubeVideo("tttG6SdnCd4", "Open in the YouTubePlayerView"));
        addItem(new YouTubeVideo("x-hH_Txxzls", "Custom \"Light Box\" player with fullscreen handling"));
        addItem(new YouTubeVideo("TTh_qYMzSZk", "Custom player controls"));
    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}

