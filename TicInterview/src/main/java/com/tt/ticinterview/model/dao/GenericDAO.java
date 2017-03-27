/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.basic.GenericBean;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author  -PNM
 */
public interface GenericDAO< T > {


    public void save(T object);


    public void delete(T object);

    public T getById(Long id) throws Exception;

    public List<T> getAll();
}
