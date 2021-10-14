/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import co.edu.unicundi.pruebaejbjar.repository.IAlumnoRepo;
import javax.ejb.Stateless;
import co.edu.unicundi.pruebaejbjar.service.IAlumnoService;
import javax.ejb.EJB;

/**
 *
 * @author ASUS
 */
@Stateless
public class IAlumnoServiceImpl implements IAlumnoService {

    @EJB
    private IAlumnoRepo repo;
    
    @Override
    public void listar() {
           System.out.println("Logica desde EstudianteServiceImpl EJB");
    }

    @Override
    public void listarPorId() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Alumno obj) {
        //Validaciones, recorridos, for
        this.repo.guardar(obj);
        
        
    }

    @Override
    public void editar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void metodo1(){
    }
    
    private void metodo2(){
    }
    
}
