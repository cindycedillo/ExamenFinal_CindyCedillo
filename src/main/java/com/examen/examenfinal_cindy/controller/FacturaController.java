/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.controller;

import com.examen.examenfinal_cindy.model.Factura;
import com.examen.examenfinal_cindy.model.Producto;
import com.examen.examenfinal_cindy.service.FacturaService;
import com.examen.examenfinal_cindy.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author TUF Gaming
 */

@RestController
@RequestMapping("/api/factura")
public class FacturaController {
    @Autowired
    FacturaService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>> listar() {
        return new ResponseEntity<>(productoService.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/listarCodigo/{id}")
    public Factura encontrarCodigo(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<Factura> crearFactura(@RequestBody Factura factura) {
        return new ResponseEntity<>(productoService.save(factura), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Factura> eliminarFactura(@PathVariable Long id) {
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    
    
}
