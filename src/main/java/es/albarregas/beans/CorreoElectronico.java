/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;

/**
 *
 * @author shirone
 */
public class CorreoElectronico implements Serializable {

    private Integer idCorreo;
    private String direccionCorreo;

    public CorreoElectronico() {
    }

    public CorreoElectronico(Integer idCorreo, String direccionCorreo) {
        this.idCorreo = idCorreo;
        this.direccionCorreo = direccionCorreo;
    }

    
       
    public Integer getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(Integer idCorreo) {
        this.idCorreo = idCorreo;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }
    
    
}
