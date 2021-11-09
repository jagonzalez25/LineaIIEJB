/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.dto;

import co.edu.unicundi.pruebaejbjar.entity.Autor;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author ASUS
 */
public class LibroDto implements Serializable{
    
    private Integer id;   
   
    private String nombre;     
    
    private String descripcion;       
    
    private Integer noPaginas;
   
    private Integer idAutor;

    public LibroDto() {
    }

    public LibroDto(Integer id, String nombre, String descripcion, Integer noPaginas, Integer idAutor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.noPaginas = noPaginas;
        this.idAutor = idAutor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNoPaginas() {
        return noPaginas;
    }

    public void setNoPaginas(Integer noPaginas) {
        this.noPaginas = noPaginas;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }
    
    
   
    
    
}
