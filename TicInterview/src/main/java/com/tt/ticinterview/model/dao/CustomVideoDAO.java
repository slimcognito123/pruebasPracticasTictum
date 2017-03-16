package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.video.CustomVideo;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 13/03/2017.
 */
@Repository
public class CustomVideoDAO implements VideoDAO<CustomVideo> {

    @Override
    public CustomVideo getById(Long id) {
        return entityManager.find(CustomVideo.class, id);
    }

    @Override
    public List<CustomVideo> getAll() {
        String prepareQuery = "select something from CustomVideo something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }

    @Override
    public List<CustomVideo> searchVideo(String nombreVideo) {
        String sql = "Select cosa from CustomVideo cosa where cosa.name like :nombre";
        Query query = entityManager.createQuery(sql);
        query.setParameter("nombre", "%" + nombreVideo + "%");
        return query.getResultList();
    }
}