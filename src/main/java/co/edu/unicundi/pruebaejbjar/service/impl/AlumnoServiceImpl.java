/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import co.edu.unicundi.pruebaejbjar.exception.BussinessException;
import co.edu.unicundi.pruebaejbjar.exception.ResourceNotFoundException;
import co.edu.unicundi.pruebaejbjar.repository.IAlumnoRepo;
import javax.ejb.Stateless;
import co.edu.unicundi.pruebaejbjar.service.IAlumnoService;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author ASUS
 */
@Stateless
public class AlumnoServiceImpl implements IAlumnoService {

    @EJB
    private IAlumnoRepo repo;
    
    @Override
    public List<Alumno> listar() {
         return repo.listarTodos();
    }

    @Override
    public Alumno listarPorId(Integer id) throws ResourceNotFoundException {
           Alumno alumno = repo.listarPorId(id);
           if(alumno != null)
               return alumno;
           else
               throw new ResourceNotFoundException("Alumno no encontrado");
    }

    @Override
    public void guardar(Alumno obj) {
        //Validaciones, recorridos, for
        this.repo.guardar(obj);
    }

    @Override
    public void editar(Alumno obj) throws BussinessException, ResourceNotFoundException {
        if(obj.getId() != null) {
            Alumno alumno = this.listarPorId(obj.getId());
            
            //Logica si la Cedula no se puede modifciar
            /*if(!obj.getCedula().equals(alumno.getCedula()))
                throw new BussinessException("Cedula no se puede modificar");*/ 
           /*if(!obj.getCedula().equals(alumno.getCedula()))
                 obj.setCedula(alumno.getCedula());*/
            
            this.repo.editar(obj);
        } else {
            throw new BussinessException("Id es obligatorio");
        }
    }

    @Override
    public void eliminar(Integer id) throws ResourceNotFoundException {
        Alumno alumno = this.listarPorId(id);
        this.repo.eliminar(alumno);
    }
    
    
    private void metodo1(){
    }
    
    private void metodo2(){
    }
    
}
