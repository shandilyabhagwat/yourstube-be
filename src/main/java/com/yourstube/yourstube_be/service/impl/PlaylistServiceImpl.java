package com.yourstube.yourstube_be.service.impl;

import com.yourstube.yourstube_be.dto.CreateImportedPlaylistDTO;
import com.yourstube.yourstube_be.dto.PlaylistDTO;
import com.yourstube.yourstube_be.repo.PlaylistRepo;
import com.yourstube.yourstube_be.service.PlaylistService;
import com.yourstube.yourstube_be.service.YouTubeService;
import com.yourstube.yourstube_be.utility.YouTubeUrlUtil;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlaylistService {

    private final PlaylistRepo playlistRepository;
    private final YouTubeService youTubeService;

    @Override
    public PlaylistDTO importPlaylist(CreateImportedPlaylistDTO request) {

        String playlistId = YouTubeUrlUtil.extractPlaylistId(request.getYoutubePlaylistUrl());

        if (playlistRepository.existsByYoutubePlaylistId(playlistId)) {
            throw new IllegalArgumentException("Playlist has already been imported");
        }

        // One YouTube API call
        Playlist youtubePlaylist = youTubeService.getPlaylist(playlistId);

        // tobe continued: save the playlist to the database and return the DTO if exists, otherwise throw an exception

        return null;
    }
}
