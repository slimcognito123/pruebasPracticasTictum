package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tictum on 14/03/2017.
 */
@Repository
public class AnswerDAO implements CrudDAO<Answer> {
    @Override
    public Answer getById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Answer> getAll() {
        return null;
    }

    //Crear metodo para Modificar Answer
}
