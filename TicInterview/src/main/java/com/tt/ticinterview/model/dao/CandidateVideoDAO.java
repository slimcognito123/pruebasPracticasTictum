/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.video.CandidateVideo;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TictumTarde
 */
@Repository("CandidateVideoDAO")
public class CandidateVideoDAO extends VideoDAO<CandidateVideo>{

    @Override
    public CandidateVideo getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CandidateVideo> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CandidateVideo> searchVideo(String nombreVideo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(CandidateVideo object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
