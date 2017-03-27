package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.video.CustomVideo;
import old.tt.ticinterview.model.dao.CustomVideoDAO;
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

@Service("CustomVideoManager")
public class CustomVideoManager implements VideoManager<CustomVideo> {

    @Autowired
    @Qualifier("CustomVideoDAO")
    private CustomVideoDAO customVideoDAO;

    @Transactional
    @Override
    public void save(CustomVideo customVideo){
        try{
            customVideoDAO.save(customVideo);
        }catch (Exception e){
            System.err.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    @Override
    public void delete (CustomVideo customVideo){
        try{
            customVideoDAO.delete(customVideo);
        }catch (Exception e){
            System.err.println("ERROR delete " + e.getStackTrace());
        }
    }


    @Override
    public CustomVideo getById(long id){
        try{
            return customVideoDAO.getById(id);
        }catch (Exception e){
            System.err.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }


    @Override
    public List<CustomVideo> getAll(){
        try{
            return customVideoDAO.getAll();
        }catch (Exception e){
            System.err.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }


    @Override
    public List<CustomVideo> searchVideo(String name){
        try{
            return customVideoDAO.searchVideo(name);
        }catch (Exception e){
            System.err.println("ERROR searchVideo " + e.getStackTrace());
        }
        return null;
    }
}
