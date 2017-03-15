package com.tt.ticinterview.model.manager;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde -JRB
 * @version 0.1
 */

public interface VideoManager<T> {

    void save(T object);

    void delete (T object);

    T getById(long id);

    List<T> getAll();

    List<T> searchVideo(String name);
}
