package com.yourstube.yourstube_be.service.impl;

import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.Playlist;
import com.google.api.services.youtube.model.PlaylistListResponse;
import com.yourstube.yourstube_be.config.YouTubeProperties;
import com.yourstube.yourstube_be.service.YouTubeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
public class YouTubeServiceImpl implements YouTubeService {

    private final YouTube youtube;
    private final YouTubeProperties youTubeProperties;

    public Playlist getPlaylist(String playlistId) {

        try {
            PlaylistListResponse response = youtube.playlists()
                    .list(List.of("snippet, contentDetails"))
                    .setId(Collections.singletonList(playlistId))
                    .setKey(youTubeProperties.getKey())
                    .execute();

            if (response.getItems() == null || response.getItems().isEmpty()) {
                throw new IllegalArgumentException("YouTube playlist not found: " + playlistId);
            }

            return response.getItems().getFirst();

        } catch (IOException e) {
            throw new RuntimeException("Failed to fetch YouTube playlist: " + playlistId, e);
        }
    }


}
