package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.beans.video.CandidateVideo;
import com.tt.ticinterview.model.dao.CandidateVideoDAO;
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
public class CandidateVideoManager {

    @Autowired
    @Qualifier("CandidateVideoDAO")
    CandidateVideoDAO candidateVideoDAO;

    @Transactional
    public void save(CandidateVideo candidateVideo){
        try{
            candidateVideoDAO.save(candidateVideo);
        }catch (Exception e){
            System.out.println("ERROR save " + e.getStackTrace());
        }
    }

    @Transactional
    public void delete (CandidateVideo candidateVideo){
        try{
            candidateVideoDAO.delete(candidateVideo);
        }catch (Exception e){
            System.out.println("ERROR delete " + e.getStackTrace());
        }
    }

    @Transactional
    public CandidateVideo getById(long id){
        try{
            return candidateVideoDAO.getById(id);
        }catch (Exception e){
            System.out.println("ERROR getById " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<CandidateVideo> getAll(){
        try{
            return candidateVideoDAO.getAll();
        }catch (Exception e){
            System.out.println("ERROR getAll " + e.getStackTrace());
        }
        return null;
    }

    @Transactional
    public List<CandidateVideo> searchVideo(String name){
        try{
            return candidateVideoDAO.searchVideo(name);
        }catch (Exception e){
            System.out.println("ERROR searchVideo " + e.getStackTrace());
        }
        return null;
    }
}
