/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service;

import co.edu.unicundi.pruebaejbjar.dto.LibroDto;
import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.entity.Libro;
import co.edu.unicundi.pruebaejbjar.exception.BussinessException;
import co.edu.unicundi.pruebaejbjar.exception.ResourceNotFoundException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
@Local
public interface ILibroService {
    
    public List<Libro> listar();
    
    public Libro listarPorId(Integer id) throws ResourceNotFoundException;
    
    public void guardar(LibroDto obj);
    
    public void editar(Libro obj) throws BussinessException, ResourceNotFoundException;
    
    public void eliminar(Integer id)  throws ResourceNotFoundException;    
    
}
