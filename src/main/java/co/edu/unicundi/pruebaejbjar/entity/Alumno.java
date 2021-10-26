/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "alumno")

@NamedQueries({
    @NamedQuery(name = "Alumno.ListarTodos", query = "SELECT a FROM Alumno a")
})



public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotNull(message = "Nombre es obligatorio")
    @Size(min = 3, max = 30, message = "Nombre debe estar entre 3 y 15 caracteres")
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    
    @NotNull(message = "Edad es obligatorio")
    @Min(value = 18, message = "Debe ser mayor de edad")
    @Column(name = "edad", nullable = false)
    private Integer edad;

    @NotNull(message = "Cedula es obligatoria")
    @Size(min = 7, max = 12, message = "Cedula debe estar entre 7 y 12 caracteres")
    @Column(name = "cedula", nullable = false, length = 12, unique = true)
    private String cedula;
    
    
    
    public Alumno() {
    }

    public Alumno(Integer id, String nombre, Integer edad, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
