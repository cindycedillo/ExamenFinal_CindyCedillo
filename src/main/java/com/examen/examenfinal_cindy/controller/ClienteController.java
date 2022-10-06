/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.controller;

import com.examen.examenfinal_cindy.model.Cliente;
import com.examen.examenfinal_cindy.service.ClienteService;
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
@RequestMapping("/api/clientes")
public class ClienteController {
    
    @Autowired
    ClienteService clienteService;

    @GetMapping("/listar")
    public ResponseEntity<List<Cliente>> listar() {
        return new ResponseEntity<>(clienteService.findByAll(), HttpStatus.OK);
    }

    @GetMapping("/listarCodigo/{id}")
    public Cliente encontrarCodigo(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente persona) {
        return new ResponseEntity<>(clienteService.save(persona), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Cliente> eliminarCliente(@PathVariable Long id) {
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    
}
