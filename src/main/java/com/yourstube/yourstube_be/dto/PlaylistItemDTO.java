package com.yourstube.yourstube_be.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class PlaylistItemDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -5562848095602404139L;

    private Long id;

    private Integer position;

    private VideoDTO video;
}
