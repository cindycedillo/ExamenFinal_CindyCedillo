/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.service;

import com.examen.examenfinal_cindy.model.Cliente;
import com.examen.examenfinal_cindy.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author TUF Gaming
 */
@Service
public class ClienteServiceImp extends GenericServiceImp<Cliente,Long> implements ClienteService {
    
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public CrudRepository<Cliente, Long> getDao() {
        return clienteRepository;
    }
    
}
