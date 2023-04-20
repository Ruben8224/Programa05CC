/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.programa05cc;

/**
 *
 * @author ruben
 */
public class Programa05CC {

    public static void main(String[] args) {
        
        DAOEmpledo dao = new DAOEmpledo();        
        Empleado empleado = new Empleado();
        empleado.setClave(1);
        empleado.setNombre("Prueba1");
        empleado.setDireccion("av 1");
        empleado.setTelefono("1234");
        
        
        //dao.create(empleado);
        //dao.delete(empleado.getClave());
        //List<Empleado> lstRes2= dao.findAll();//prueba findAll
        //for (Empleado empleado lstRes2)//prueba de findAll
        dao.findAll();
        //dao.findByID();
        
        
        
        
        System.out.println("Hello World!");
    }
}
