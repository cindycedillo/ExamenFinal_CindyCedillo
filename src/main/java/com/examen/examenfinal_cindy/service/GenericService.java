/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.service;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author TUF Gaming
 */
public interface GenericService <T,ID extends Serializable>{
    
    public T save(T entity);
    public T findById(ID id);
    public List <T> findByAll();
    public void delete(ID id);
    
}
