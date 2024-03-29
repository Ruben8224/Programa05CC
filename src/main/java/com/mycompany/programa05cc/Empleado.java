/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programa05cc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ruben
 */

@Entity
@Table(name = "ejemplo")
public class Empleado {
    
     @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clave")
    private long clave = 0;
    
    @Column(name = "nombre")
    private String nombre = " ";
    
    @Column(name = "direccion")
    private String direccion = " ";
    
    @Column(name = "telefono")
    private String telefono = " ";


    public long getClave() {
        return clave;
    }

    public void setClave(long clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
