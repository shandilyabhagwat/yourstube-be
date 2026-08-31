package com.yourstube.yourstube_be.config;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.mtls.MtlsUtils;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.YouTubeRequestInitializer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static com.google.api.client.googleapis.apache.v2.GoogleApacheHttpTransport.newTrustedTransport;

@Configuration
@RequiredArgsConstructor
public class YouTubeConfig {

    private YouTubeProperties youTubeProperties;

    @Bean
    public YouTube youTube() throws GeneralSecurityException, IOException {
        HttpRequestInitializer httpRequestInitializer = new HttpRequestInitializer() {
            @Override
            public void initialize(HttpRequest request) throws IOException {
                // no-op: API key is appended per-request via YouTubeRequestInitializer,
                // not through OAuth credentials here
            }
        };

        return new YouTube.Builder(
                newTrustedTransport(MtlsUtils.getDefaultMtlsProvider()),
                GsonFactory.getDefaultInstance(),
                httpRequestInitializer)
                .setApplicationName(youTubeProperties.getApplicationName())
                .build();
    }
}