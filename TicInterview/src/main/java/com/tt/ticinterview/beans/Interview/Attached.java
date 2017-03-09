package com.tt.ticinterview.beans.Interview;

import java.io.Serializable;

/**
 * Created by J on 09/03/2017.
 */
public class Attached implements Serializable {

    private long id;
    private String description;
    private String path;

    public Attached() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
