package com.yourstube.yourstube_be.dto;

import com.yourstube.yourstube_be.entity.PlaylistType;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PlaylistDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -2862790290233232515L;

    private Long id;

    private String title;

    private String description;

    private PlaylistType type;

    private List<PlaylistItemDTO> playlistItems;

    private String youtubePlaylistId;

    private String youtubePlaylistUrl;

    private Long createdBy;

    private Long updatedBy;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
