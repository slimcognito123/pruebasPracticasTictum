/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.beans.video;

import java.io.Serializable;

/**
 * @since 09/03/2017
 * @author tictumTarde -PNM
 * @version 0.1
 */
public class CustomVideo implements Video, Serializable{

    private long id;
    private String path;
    private String name;

    public CustomVideo() {
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
