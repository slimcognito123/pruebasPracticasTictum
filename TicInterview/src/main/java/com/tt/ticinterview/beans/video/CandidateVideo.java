package com.tt.ticinterview.beans.video;

import java.io.Serializable;

/**
 * Created by J on 09/03/2017.
 */
public class CandidateVideo implements Video, Serializable{

    private long id;
    private String path;
    private String name;
    private int tMax;

    public CandidateVideo() {
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    public int gettMax() {
        return tMax;
    }

    public void settMax(int tMax) {
        this.tMax = tMax;
    }
}
