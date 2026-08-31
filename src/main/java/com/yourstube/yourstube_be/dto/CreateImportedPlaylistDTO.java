package com.yourstube.yourstube_be.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@RequiredArgsConstructor
@Getter
@Setter
@Data
public class CreateImportedPlaylistDTO implements Serializable{

    @Serial
    private static final long serialVersionUID = 361592315018121939L;

    @NotBlank(message = "YouTube playlist URL is required")
    private String youtubePlaylistUrl;
}
