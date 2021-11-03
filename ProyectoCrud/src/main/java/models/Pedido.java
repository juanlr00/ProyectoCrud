/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author juanl
 */
public class Pedido implements Serializable {
    private Integer idProd;
    private String nombreProd;
    private String estadoProd;
    private Integer fechaProd;

    public Pedido() {
    }

    public Pedido(Integer idProd, String nombreProd, String estadoProd, Integer precioProd) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.estadoProd = estadoProd;
        this.fechaProd = precioProd;
    }

    public Integer getIdProd() {
        return idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(String estadoProd) {
        this.estadoProd = estadoProd;
    }

    public Integer getFechaProd() {
        return fechaProd;
    }

    public void setFechaProd(Integer precioProd) {
        this.fechaProd = precioProd;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idProd=" + idProd + ", nombreProd=" + nombreProd + ", estadoProd=" + estadoProd + ", fechaProd=" + fechaProd + '}';
    }
    
}
