package com.tt.ticinterview.beans.basic;

/**
 * Created by Tictum on 10/03/2017.
 */
public abstract class GenericBean {
    private long id;
    public long getId(){
        
        return id;
    }
    /**
     * Devolvera el nombre
     * @return 
     */
    public abstract String getInstanceName();
}
