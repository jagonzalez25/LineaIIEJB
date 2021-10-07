/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.service.IEstudianteService;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class EstudianteServiceImpl implements IEstudianteService {

    
    @Override
    public void listar() {
           System.out.println("Logica desde EstudianteServiceImpl EJB");
    }

    @Override
    public void listarPorId() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar() {
        String nombre, clave;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
