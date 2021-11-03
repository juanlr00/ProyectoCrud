/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author juanl
 */
public class Carta implements Serializable{
    private Integer id;
    private String idProducto;
    private String estadoPedido;
    private Integer precioProd;

    public Carta() {
    }

    public Carta(Integer id, String idProducto, String estadoPedido, Date fecha) {
        this.id = id;
        this.idProducto = idProducto;
        this.estadoPedido = estadoPedido;
        this.precioProd = precioProd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Integer getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Integer precioProd) {
        this.precioProd = precioProd;
    }

    @Override
    public String toString() {
        return "Carta{" + "id=" + id + ", idProducto=" + idProducto + ", estadoPedido=" + estadoPedido + ", precioProd=" + precioProd + '}';
    }

    public void setPrecioProd(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
