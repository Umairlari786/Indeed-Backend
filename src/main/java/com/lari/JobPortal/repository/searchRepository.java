package com.lari.JobPortal.repository;

import com.lari.JobPortal.Model.Post;

import java.util.List;

public interface searchRepository {

    List<Post> findByText(String text);
}
