package com.tt.ticinterview.beans.video;

import java.io.Serializable;

/**
 * Created by J on 09/03/2017.
 */
public class CorporativeVideo implements Video,Serializable {

    private long id;
    private String path;
    private String name;

    public CorporativeVideo() {
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
