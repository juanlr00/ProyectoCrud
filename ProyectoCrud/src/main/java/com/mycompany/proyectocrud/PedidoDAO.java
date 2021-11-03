/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Pedido;

/**
 *
 * @author juanl
 */
public class PedidoDAO {
   private static Connection con;
    
    static{
        String url = "jdbc:mysql://localhost:3306/proyectocrud?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión establecida con la base de datos");
        } catch (SQLException ex) {
            Logger.getLogger(CartaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static final String LIST_QUERY ="SELECT * FROM pedido";
    static final String INSERT_QUERY = "INSERT INTO pedido(idProd,nombreProd,estadoProd,Prod) VALUES (?,?,?)";
    static final String LIST_QUERY_HOY = "SELECT * FROM pedidos WHERE fecha_pedido='2021-11-02'";
    static final String ELIMINAR_PEDIDO = "DELETE FROM pedidos WHERE idProd=? ";
    static final String ACTUALIZAR_PEDIDO = "UPDATE  pedido SET estado_Prod = 'Regocido' WHERE idProd = ?";
    
    //Metodo listar todos los pedidos
    public ArrayList<Pedido> list(){
        
        var salida = new ArrayList<Pedido>();
        
        try( Statement st = con.createStatement() ){
            
            ResultSet resultado = st.executeQuery(LIST_QUERY);
            
            while(resultado.next()){
                Pedido p = new Pedido();
                p.setIdProd( resultado.getInt("idProd") );
                p.setEstadoProd( resultado.getString("estadoProd") );
                p.setNombreProd( resultado.getString("nombreProd") );
                p.setFechaProd( resultado.getInt("fechaProd") );
                
                salida.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return salida;
        
    }
    
    //Método para eliminar pedidos
    public boolean eliminar ( Integer idProd) {
        try( PreparedStatement ps = con.prepareStatement(ELIMINAR_PEDIDO)){
           
            ps.setInt(1, idProd);
            return ps.executeUpdate()==1;
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
        return false;

    }
    
    //Método para saber si el pedido ha sido recogido
    public int pedidoRecogido(Integer idProd) {
        try( PreparedStatement ps = con.prepareStatement(ACTUALIZAR_PEDIDO)){
           
            ps.setInt(1, idProd);
            return ps.executeUpdate();
        
        
    }   catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
       return 0;
       
 }
    //Método para saber los pedidos que hay hoy
    public ArrayList<Pedido> pedidosHoy(){
        
        var salida = new ArrayList<Pedido>();
        
        try( Statement st = con.createStatement() ){
            
            ResultSet resultado = st.executeQuery(LIST_QUERY_HOY);
            
            while(resultado.next()){
                Pedido p = new Pedido();
                p.setIdProd( resultado.getInt("idProd") );
                p.setEstadoProd( resultado.getString("estadoProd") );
                p.setNombreProd( resultado.getString("nombreProd") );
                p.setFechaProd( resultado.getInt("fechaProd") );
                
                salida.add(p);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return salida;
        
    }
}


    

