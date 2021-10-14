/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
//
//@Remote
@Local
public interface IAlumnoService {
    
    public void listar();
    
    public void listarPorId();
    
    public void guardar(Alumno obj);
    
    public void editar();
    
    public void eliminar();
    
}
