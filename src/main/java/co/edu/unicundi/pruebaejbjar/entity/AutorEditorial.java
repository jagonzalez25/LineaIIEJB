/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "autor_editorial")

@NamedQueries({
    @NamedQuery(name = "AutorEditorial.listarPorAutor", query = "SELECT a FROM AutorEditorial a WHERE a.autor.id = :idAutor")
})
public class AutorEditorial implements Serializable{
    
    @EmbeddedId
    private AutorEditorialPK autorEditorialId;
    
    @ManyToOne
    @MapsId("idAutor")
    private Autor autor;
    
    @ManyToOne
    @MapsId("idEditorial")
    private Editorial editorial;
    
    @Column(name = "info_adicional", length = 25)
    private String infoAdicional;

    public AutorEditorial() {
    }

    public AutorEditorial(Autor autor, Editorial editorial, String infoAdicional) {
        this.autor = autor;
        this.editorial = editorial;
        this.infoAdicional = infoAdicional;
    }

    public AutorEditorialPK getAutorEditorialId() {
        return autorEditorialId;
    }

    public void setAutorEditorialId(AutorEditorialPK autorEditorialId) {
        this.autorEditorialId = autorEditorialId;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }
     
}
