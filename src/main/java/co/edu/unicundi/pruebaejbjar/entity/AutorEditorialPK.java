/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author ASUS
 */
@Embeddable
public class AutorEditorialPK implements Serializable {
    
    @Column(name = "id_autor", nullable =  false)
    private Integer idAutor;
    
    @Column(name = "id_editorial", nullable =  false)
    private Integer idEditorial;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idAutor);
        hash = 47 * hash + Objects.hashCode(this.idEditorial);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AutorEditorialPK other = (AutorEditorialPK) obj;
        if (!Objects.equals(this.idAutor, other.idAutor)) {
            return false;
        }
        if (!Objects.equals(this.idEditorial, other.idEditorial)) {
            return false;
        }
        return true;
    }
}
