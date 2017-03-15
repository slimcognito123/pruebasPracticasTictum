package com.tt.ticinterview.model.manager;

import com.tt.ticinterview.model.dao.BasicUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @since 09/03/2017
 * @author tictumTarde - JRB
 * @version 0.1
 * @
 */

public interface UserManager<T> {

    void register(T object);

    T getById(long id);

    T getByMail(String mail);

    List<T> getAll();

    void modify(T object);

    void delete(T object);

}
