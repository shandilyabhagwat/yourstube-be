package com.yourstube.yourstube_be.constant;

import java.util.Set;

public class CommonConstants {

    public static final String PLAYLIST_ID_PARAM = "list";
    public static final String YOUTUBE_PLAYLIST_PATH = "/playlist";
    public static final String HTTPS_SCHEME = "https";
    public static final Set<String> YOUTUBE_HOSTS = Set.of("youtube.com", "www.youtube.com", "m.youtube.com");

    private CommonConstants() {
        // Prevent instantiation
    }
}
