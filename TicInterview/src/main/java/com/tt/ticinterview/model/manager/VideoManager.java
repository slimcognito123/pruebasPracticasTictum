package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.model.dao.VideoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - PNM
 * @version 0.1
 * @
 */

@Service
public class VideoManager<T> {

    @Autowired
    @Qualifier("VideoDAO")
    VideoDAO videoDAO;

    @Transactional
    public void save(T object){

    }

    @Transactional
    public void delete (T object){

    }

    @Transactional
    public T getById(long id){
        return null;
    }

    @Transactional
    public List<T> getAll(){
        return null;
    }

    @Transactional
    public List<T> searchVideo(String name){
        return null;
    }
}
