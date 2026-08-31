package com.yourstube.yourstube_be.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "youtube.api")
@Getter
@Setter
public class YouTubeProperties {

    private String key;
    private String applicationName;
}