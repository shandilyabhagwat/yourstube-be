package com.yourstube.yourstube_be.service;

import com.google.api.services.youtube.model.Playlist;

public interface YouTubeService {
    Playlist getPlaylist(String playlistId);
}
