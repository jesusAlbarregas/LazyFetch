/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.beans;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author shirone
 */
public class Profesor implements Serializable {
    
    private Integer idProf;
    private String nombre;
    private Set<CorreoElectronico> correos;

    public Profesor() {
    }

    public Profesor(Integer idProf, String nombre) {
        this.idProf = idProf;
        this.nombre = nombre;
        
    }

    
    
    public Integer getIdProf() {
        return idProf;
    }

    public void setIdProf(Integer idProf) {
        this.idProf = idProf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<CorreoElectronico> getCorreos() {
        return correos;
    }

    public void setCorreos(Set<CorreoElectronico> correos) {
        this.correos = correos;
    }
    
}
