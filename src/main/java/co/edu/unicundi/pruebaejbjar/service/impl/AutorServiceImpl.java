/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.exception.BussinessException;
import co.edu.unicundi.pruebaejbjar.exception.ResourceNotFoundException;
import co.edu.unicundi.pruebaejbjar.repository.IAutor;
import co.edu.unicundi.pruebaejbjar.service.IAutorService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class AutorServiceImpl implements IAutorService {

    @EJB
    private IAutor repo;
    
    @Override
    public List<Autor> listar() {
        return repo.listarTodos();
    }

    @Override
    public Autor listarPorId(Integer id) throws ResourceNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardar(Autor obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(Autor obj) throws BussinessException, ResourceNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Integer id) throws ResourceNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
