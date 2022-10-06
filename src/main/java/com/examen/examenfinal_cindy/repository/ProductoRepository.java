/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.repository;

import com.examen.examenfinal_cindy.model.Cliente;
import com.examen.examenfinal_cindy.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author TUF Gaming
 */
public interface ProductoRepository extends MongoRepository<Producto,Long>{
    
}
