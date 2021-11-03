/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Carta;

/**
 *
 * @author juanl
 */
public class CartaDAO {
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
    
    static final String LIST_QUERY ="SELECT * FROM carta";
    static final String INSERT_QUERY = "INSERT INTO carta(id,idProducto,estadoPedido,precioProd) VALUES (?,?,?)";
   
    
    
    public ArrayList<Carta> list(){
        
        var salida = new ArrayList<Carta>();
        
        try( Statement st = con.createStatement() ){
            
            ResultSet resultado = st.executeQuery(LIST_QUERY);
            
            while(resultado.next()){
                Carta c = new Carta();
                c.setId( resultado.getInt("id") );
                c.setIdProducto( resultado.getString("idProducto") );
                c.setEstadoPedido( resultado.getString("estadoPedido") );
                
                
                salida.add(c);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CartaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return salida;
        
    }
    
}
