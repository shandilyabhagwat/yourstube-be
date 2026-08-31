package com.yourstube.yourstube_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class VideoDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1234567890123456789L;

    private Long id;

    private String youtubeVideoId;

    private String title;

    private String description;

    private String thumbnailUrl;

    private Long durationSeconds;

    private ChannelDTO channel;
}
