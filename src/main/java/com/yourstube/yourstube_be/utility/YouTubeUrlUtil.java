package com.yourstube.yourstube_be.utility;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.yourstube.yourstube_be.constant.CommonConstants.*;

public final class YouTubeUrlUtil {

    private YouTubeUrlUtil() {
    }

    public static String extractPlaylistId(String url) {
        if (url == null || url.isBlank()) {
            throw new IllegalArgumentException("YouTube playlist URL cannot be empty");
        }

        try {
            URI uri = new URI(url.trim());

            validateYouTubeUrl(uri);

            String query = uri.getQuery();

            if (query == null || query.isBlank()) {
                throw new IllegalArgumentException("YouTube playlist ID is missing");
            }
            for (String parameter : query.split("&")) {
                String[] keyValue = parameter.split("=", 2);
                if (keyValue.length == 2 && PLAYLIST_ID_PARAM.equals(keyValue[0]) && !keyValue[1].isBlank()) {
                    return keyValue[1];
                }
            }

        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid URL", e);
        }

        throw new IllegalArgumentException("YouTube playlist ID is missing");
    }

    private static void validateYouTubeUrl(URI uri) {

        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();

        if (!HTTPS_SCHEME.equalsIgnoreCase(scheme)) {
            throw new IllegalArgumentException("URL must use HTTPS");
        }

        if (!isYouTubeHost(host)) {
            throw new IllegalArgumentException("URL must be a YouTube URL");
        }

        if (!YOUTUBE_PLAYLIST_PATH.equals(path)) {
            throw new IllegalArgumentException("URL must be a YouTube playlist URL");
        }
    }

    private static boolean isYouTubeHost(String host) {

        if (host == null) {
            return false;
        }

        for (String youtubeHost : YOUTUBE_HOSTS) {
            if (youtubeHost.equalsIgnoreCase(host)) {
                return true;
            }
        }

        return false;
    }

}