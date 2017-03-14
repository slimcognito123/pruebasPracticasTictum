package com.tt.ticinterview.beans.basic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Tictum on 10/03/2017.
 */

public class InstanceEntityManager {

        @PersistenceContext(unitName = "myPersistenceUnit")
        public static EntityManager em;

        public static EntityManager getEm() {
            return em;
        }


}
