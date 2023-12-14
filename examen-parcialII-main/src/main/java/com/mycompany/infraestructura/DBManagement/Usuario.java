/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infraestructura.DBManagement;

import com.mycompany.infraestructura.Modelo.UsuarioModelo;
import com.mycompany.infraestructura.conexiones.Conexiones;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Usuario {
    private Conexiones conexion;

    public Usuario(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarUsuario(UsuarioModelo usuario){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO usuario(" +
                    "nombre, " +
                    "email, " +
                    "pass) " +
                    " values('" +
                    usuario.getNombre() + "', '" +
                    usuario.getEmail() + "', '" +
                    usuario.getPass() +
                    "')");
            conexion.conexionDB().close();
            return "La ciudad " + usuario.getNombre() + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarusuario(UsuarioModelo usuario, int id){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE usuario SET " +
                    "nombre = '" + usuario.getNombre() + "'," +
                    "email = '" + usuario.getEmail() + "'," +
                    "pass = '" + usuario.getPass() + "'" 
                            + " Where id = " + id);
            conexion.conexionDB().close();
            return "Los datos del usuario " + usuario.getNombre() + " fue modificado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public UsuarioModelo consultarusuario(int id){
            UsuarioModelo usuario= new UsuarioModelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from usuario where id = " + id));
            if(conexion.getResultadoQuery().next()){
                usuario.setNombre(conexion.getResultadoQuery().getString("nombre"));
                usuario.setEmail(conexion.getResultadoQuery().getString("email"));
                usuario.setPass(conexion.getResultadoQuery().getString("pass"));
                
                return usuario;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
