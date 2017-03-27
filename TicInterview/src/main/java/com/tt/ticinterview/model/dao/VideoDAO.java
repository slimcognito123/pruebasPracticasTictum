package com.tt.ticinterview.model.dao;



import java.util.List;

/**
 * Created by Tictum on 10/03/2017.
 * @param <T>
 */
public abstract class VideoDAO<T> extends CrudDAOImplementation<T> {

    @Override
    public abstract T getById(Long id);

    @Override
    public abstract List<T> getAll();

    public abstract List<T> searchVideo(String nombreVideo);

}
