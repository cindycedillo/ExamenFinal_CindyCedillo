/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.service;

import com.examen.examenfinal_cindy.model.Producto;
import com.examen.examenfinal_cindy.repository.ClienteRepository;
import com.examen.examenfinal_cindy.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author TUF Gaming
 */
@Service
public class ProductoServiceImp  extends GenericServiceImp<Producto,Long> implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    
    @Override
    public CrudRepository<Producto, Long> getDao() {
       return productoRepository;
    }
    
}
