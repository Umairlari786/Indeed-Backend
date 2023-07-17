package com.lari.JobPortal.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
@Document(collection = "JobReq")
public class Post {
    private String profile;
    private String description;
    private int exp;
    private String []skils;

    public Post() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", description='" + description + '\'' +
                ", exp=" + exp +
                ", skils=" + Arrays.toString(skils) +
                '}';
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String[] getSkils() {
        return skils;
    }

    public void setSkils(String[] skils) {
        this.skils = skils;
    }
}
