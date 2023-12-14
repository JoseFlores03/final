/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infraestructura.DBManagement;

import com.mycompany.infraestructura.Modelo.MovimientoModelo;
import com.mycompany.infraestructura.conexiones.Conexiones;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class Movimientos {
     private Conexiones conexion;

    public Movimientos(String userBD, String passDB, String hostDB, String portDB, String dataBase){
        conexion = new Conexiones(userBD, passDB, hostDB, portDB, dataBase);
    }

    public String registrarMovimiento(MovimientoModelo movimientos){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("INSERT INTO movimientos(" +
                    "idmovimiento, " +
                    "idcuenta, " +
                    "tipomovimiento, " +
                    "saldoanterior, " +
                    "saldoactual, " +
                    "'montomovimiento, " +
                    "'cuentaorigen, " +
                    "'cuentadestino, " +
                    "'canal, " +
                    "'fechamovimiento, " +
                    "values('" +
                    movimientos.getIdMovimiento()+ "', '" +
                    movimientos.getIdCuenta()+ "', '" +
                    movimientos.getTipoMovimiento()+ "', '" +
                    movimientos.getSalarioAnterior()+ "', '" +
                    movimientos.getSaldoActual()+ "', '" +
                    movimientos.getMontoMovimiento()+ "', '" +
                    movimientos.getCuentaOrigen()+ "', '" +
                    movimientos.getCuentaDestino()+ "', '" +
                    movimientos.getCanal() + "', '" +
                    movimientos.getFechaMovimiento() + "'))");
            conexion.conexionDB().close();
            return "El movimiento Nro: " + movimientos.getIdMovimiento() + " fue registrado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String modificarCliente(MovimientoModelo movimientos){

        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            boolean execute = conexion.getQuerySQL().execute("UPDATE cliente SET " +
                    "idcuenta = '" + movimientos.getIdCuenta() + "'," +
                    "tipomovimiento = '" + movimientos.getTipoMovimiento() + "'," +
                    "saldoanterior = '" + movimientos.getSalarioAnterior() + "'," +
                    "saldoactual = '" + movimientos.getSaldoActual() + "'," +
                    "montomovimiento = '" + movimientos.getMontoMovimiento() + "'," +
                    "cuentaorigen = '" + movimientos.getCuentaOrigen() + "'," +
                    "cuentadestino = '" + movimientos.getCuentaDestino() + "'," +        
                    "canal = '" + movimientos.getCanal() + "'," +
                    "fechamovimiento = '" + movimientos.getFechaMovimiento() + "' " + " Where idcliente = " + movimientos.getIdMovimiento());
            conexion.conexionDB().close();
            return "Los datos del movimiento Nro:" + movimientos.getIdMovimiento() + " fue modificado correctamente!!!";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public MovimientoModelo consultarMovimiento(int id){
        MovimientoModelo movimientos = new MovimientoModelo();
        try {
            conexion.setQuerySQL(conexion.conexionDB().createStatement());
            conexion.setResultadoQuery(conexion.getQuerySQL().executeQuery("Select * from cliente where idmovimiento = " + id));
            if(conexion.getResultadoQuery().next()){
                movimientos.IdMovimiento = conexion.getResultadoQuery().getInt("idmovimiento");
                movimientos.IdCuenta = conexion.getResultadoQuery().getInt("idcuenta");
                movimientos.TipoMovimiento = conexion.getResultadoQuery().getString("tipomovimiento");
                movimientos.SalarioAnterior = conexion.getResultadoQuery().getFloat("salarioanterior");
                movimientos.SaldoActual = conexion.getResultadoQuery().getFloat("saldoactual");
                movimientos.MontoMovimiento = conexion.getResultadoQuery().getFloat("montomovimiento");
                movimientos.CuentaOrigen = conexion.getResultadoQuery().getFloat("cuentaorigen");
                movimientos.CuentaDestino = conexion.getResultadoQuery().getFloat("cuentadestino");
                movimientos.Canal = conexion.getResultadoQuery().getFloat("canal");
                movimientos.FechaMovimiento = conexion.getResultadoQuery().getDate("fechamovimiento");
                return movimientos;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
}
