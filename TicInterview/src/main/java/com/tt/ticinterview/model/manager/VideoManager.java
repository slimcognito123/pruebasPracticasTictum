package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.model.dao.VideoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */

@Service
public class VideoManager<T> {

    @Autowired
    @Qualifier("VideoDAO")
    private VideoDAO videoDAO;

    @Transactional
    public void save(T object){
        try{
            videoDAO.save(object);
        }catch (Exception e){
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete (T object){
        try{
            videoDAO.delete(object);
        }catch (Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public T getById(long id){
        try{
            return videoDAO.getById(id);
        }catch (Exception e){
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<T> getAll(){
        try{
            return videoDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<T> searchVideo(String name){
        try{
            return videoDAO.searchVideo(name);
        }catch (Exception e){
            System.err.println("ERROR searchVideo " + e.getStackTrace());
        }
        return null;
    }
}
