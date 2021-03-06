package io.braxton.topicvoter.models;

public class Topic {
    private long id;
    private String title;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
