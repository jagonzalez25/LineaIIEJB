/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.dto;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class AutorEditorialDto implements Serializable{
    
 
    private AutorDto autor;
   
    private EditorialDto editorial;
 
    private String infoAdicional;

    public AutorEditorialDto() {

    }

    public AutorDto getAutor() {
        return autor;
    }

    public void setAutor(AutorDto autor) {
        this.autor = autor;
    }

    public EditorialDto getEditorial() {
        return editorial;
    }

    public void setEditorial(EditorialDto editorial) {
        this.editorial = editorial;
    }

    public String getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(String infoAdicional) {
        this.infoAdicional = infoAdicional;
    }


  

}
