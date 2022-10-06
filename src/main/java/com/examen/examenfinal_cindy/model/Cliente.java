/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examen.examenfinal_cindy.model;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author TUF Gaming
 */
public class Cliente {
    
    @Id
    Long id;
    Integer dni;
    String nombre;
    String apellido;
    String telefono;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDnii() {
        return dni;
    }

    public void setDnii(Integer dnii) {
        this.dni = dnii;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
