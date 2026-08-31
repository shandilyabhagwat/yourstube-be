package com.yourstube.yourstube_be.service;

import com.yourstube.yourstube_be.dto.CreateImportedPlaylistDTO;
import com.yourstube.yourstube_be.dto.PlaylistDTO;

public interface PlaylistService {
    PlaylistDTO importPlaylist(CreateImportedPlaylistDTO createImportedPlaylistDTO);
}
