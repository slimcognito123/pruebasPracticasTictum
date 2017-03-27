/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.video.CorporativeVideo;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author TictumTarde
 */
@Repository("CorporativeVideoDAO")
public class CorpotativeVideoDAO extends VideoDAO<CorporativeVideo>{

    @Override
    public CorporativeVideo getById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CorporativeVideo> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CorporativeVideo> searchVideo(String nombreVideo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(CorporativeVideo object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
