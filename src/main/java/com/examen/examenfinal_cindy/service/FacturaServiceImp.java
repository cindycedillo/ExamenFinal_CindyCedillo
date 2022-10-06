/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.service;

import com.examen.examenfinal_cindy.model.Factura;
import com.examen.examenfinal_cindy.model.Producto;
import com.examen.examenfinal_cindy.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author TUF Gaming
 */
@Service
public class FacturaServiceImp extends GenericServiceImp<Factura,Long> implements FacturaService {
    @Autowired
    FacturaRepository facturaRepository;
    
    @Override
    public CrudRepository<Factura, Long> getDao() {
    return facturaRepository;
    }
    
}
