/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicios;

import com.mycompany.infraestructura.DBManagement.Cuentas;
import com.mycompany.infraestructura.Modelo.CuentaModelo;


/**
 *
 * @author hp
 */
public class CuentasService {
   Cuentas cuentaDB;
    public CuentasService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        cuentaDB = new Cuentas(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarCuenta(CuentaModelo cuenta){
        if(validarDatos(cuenta)){
           return cuentaDB.registrarCuentas(cuenta);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }

    public String modificarCuenta(CuentaModelo cuenta){
        if(validarDatos(cuenta)){
            return cuentaDB.modificarcuenta(cuenta);
        }
        return "Ocurrió algún error, contactese con el Administrador";
    }


    public CuentaModelo consultarCuenta(int id){
        return  cuentaDB.consultarcuenta(id);
    }

    private boolean validarDatos(CuentaModelo cuenta) {
        try {
        if(cuenta.NroCuenta.trim().isEmpty())
            throw new Exception("El nombre no debe estar vacío");
        else if (cuenta.NroCuenta.trim().length() < 3) {
            throw new Exception("El nombre no tiene la longitud necesaria");
        }

    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }  
}
