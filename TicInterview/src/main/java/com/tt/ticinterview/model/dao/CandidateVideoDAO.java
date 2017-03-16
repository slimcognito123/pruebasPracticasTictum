package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.video.CandidateVideo;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 13/03/2017.
 */
@Repository
public class CandidateVideoDAO implements VideoDAO<CandidateVideo> {
    @Override
    public CandidateVideo getById(Long id) {
        return entityManager.find(CandidateVideo.class, id);
    }

    @Override
    public List<CandidateVideo> getAll() {
        String prepareQuery = "select something from CandidateVideo something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }

    @Override
    public List<CandidateVideo> searchVideo(String nombreVideo) {
        String sql = "Select cosa from CandidateVideo cosa where cosa.name like :nombre";
        Query query = entityManager.createQuery(sql);
        query.setParameter("nombre", "%" + nombreVideo + "%");
        return query.getResultList();
    }
}
