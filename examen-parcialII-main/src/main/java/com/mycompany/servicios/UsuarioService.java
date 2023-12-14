/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servicios;

import com.mycompany.infraestructura.DBManagement.Usuario;
import com.mycompany.infraestructura.Modelo.UsuarioModelo;

/**
 *
 * @author hp
 */
public class UsuarioService {
    Usuario usuarioDB;
    public UsuarioService(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        usuarioDB = new Usuario(userBD, passDB, hostDB, portDB, dataBase);
    }

    public UsuarioModelo consultarUsuario(int id){
        return  usuarioDB.consultarusuario(id);
    }

    public boolean validarDatos(String email, String pass, UsuarioModelo usuario) {
        try {
        if(email.trim().isEmpty())
            throw new Exception("El Email no debe estar vacío");
        else if (email.trim().length() < 3) {
            throw new Exception("El Email no tiene la longitud necesaria");
        }else if (pass.trim().length() < 3) {
            throw new Exception("La contraseña no tiene la longitud necesaria");
        }else if (pass != usuario.getPass()) {
            throw new Exception("La contraseña es incorrecta. ");
        }



    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return true;
    }
}
