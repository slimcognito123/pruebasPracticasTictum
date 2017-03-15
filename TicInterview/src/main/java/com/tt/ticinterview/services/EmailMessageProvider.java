package com.tt.ticinterview.services;

import org.springframework.core.io.Resource;

import java.util.Map;

/**
 * Created by Tictum on 15/03/2017.
 */
public interface EmailMessageProvider {
    public String getSubject();

    public String getBody();

    public Map<String, Resource> getInlineFiles();
}
