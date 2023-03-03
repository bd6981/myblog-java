package com.mycompany.myblog.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Post {

    private final UUID id;

    private final String title;

    private String content;

    public Post(@JsonProperty("id") UUID id,
                @JsonProperty("title") String title) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
