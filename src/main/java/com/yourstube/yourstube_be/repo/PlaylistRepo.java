package com.yourstube.yourstube_be.repo;

import com.yourstube.yourstube_be.entity.PlaylistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepo extends JpaRepository<PlaylistEntity, Long> {
    boolean existsByYoutubePlaylistId(String playlistId);
}
