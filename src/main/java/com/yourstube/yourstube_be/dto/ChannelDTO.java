package com.yourstube.yourstube_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ChannelDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -8322366125316103450L;

    private Long id;

    private String youtubeChannelId;

    private String name;

    private String description;

    private String thumbnailUrl;
}