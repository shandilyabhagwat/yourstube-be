package com.yourstube.yourstube_be.controller;

import com.yourstube.yourstube_be.dto.CreateImportedPlaylistDTO;
import com.yourstube.yourstube_be.dto.PlaylistDTO;
import com.yourstube.yourstube_be.service.PlaylistService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/playlist")
public class PlaylistController {

    private final PlaylistService playlistService;

    @PostMapping("/import")
    public PlaylistDTO importPlaylist(@Valid @RequestBody CreateImportedPlaylistDTO request) {
        return playlistService.importPlaylist(request);
    }
}
