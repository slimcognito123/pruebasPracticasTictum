package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.video.CorporativeVideo;
import com.tt.ticinterview.model.dao.CorporativeVideoDAO;
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
public class CorporativeVideoManager {

    @Autowired
    @Qualifier("CorporativeVideoDAO")
    CorporativeVideoDAO corporativeVideoDAO;

    @Transactional
    public void save(CorporativeVideo corporativeVideo){
        try{
            corporativeVideoDAO.save(corporativeVideo);
        }catch (Exception e){
            System.out.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete (CorporativeVideo corporativeVideo){
        try{
            corporativeVideoDAO.delete(corporativeVideo);
        }catch (Exception e){
            System.out.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public CorporativeVideo getById(long id){
        try{
            return corporativeVideoDAO.getById(id);
        }catch (Exception e){
            System.out.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<CorporativeVideo> getAll(){
        try{
            return corporativeVideoDAO.getAll();
        }catch (Exception e){
            System.out.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<CorporativeVideo> searchVideo(String name){
        try{
            return corporativeVideoDAO.searchVideo(name);
        }catch (Exception e){
            System.out.println("ERROR searchVideo " + e.getStackTrace());
        }
        return null;
    }
}
