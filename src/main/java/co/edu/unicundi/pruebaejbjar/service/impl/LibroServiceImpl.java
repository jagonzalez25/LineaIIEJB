/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.dto.LibroDto;
import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.entity.Libro;
import co.edu.unicundi.pruebaejbjar.exception.BussinessException;
import co.edu.unicundi.pruebaejbjar.exception.ResourceNotFoundException;
import co.edu.unicundi.pruebaejbjar.repository.ILibroRepo;
import co.edu.unicundi.pruebaejbjar.service.IAutorService;
import co.edu.unicundi.pruebaejbjar.service.ILibroService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class LibroServiceImpl implements ILibroService {

    @EJB
    private ILibroRepo repo;
    
    
    @Override
    public List<Libro> listar() {
        return repo.listarTodos();
    }

    @Override
    public Libro listarPorId(Integer id) throws ResourceNotFoundException {
        Libro libro = repo.listarPorId(id);
        if(libro != null)
               return libro;
        else
               throw new ResourceNotFoundException("Libro no encontrado");
    }

    //Forma 1
    /*@Override
    public void guardar(Libro obj) {
        Autor autor = new Autor();
        autor.setId(obj.getIdAutorAux());
        obj.setAutor(autor);
        this.repo.guardar(obj);
    }*/
    
     public void guardar(LibroDto obj) {
         Autor autor = new Autor();
         autor.setId(obj.getIdAutor());
        
         Libro libro = new Libro();
         libro.setDescripcion(obj.getDescripcion());
         libro.setNoPaginas(obj.getNoPaginas());
         libro.setNombre(obj.getNombre());
         libro.setAutor(autor);
         
         this.repo.guardar(libro);
     }

    @Override
    public void editar(Libro obj) throws BussinessException, ResourceNotFoundException {
       Libro libro = listarPorId(obj.getId());
       libro.setDescripcion(obj.getDescripcion());
       libro.setNoPaginas(obj.getNoPaginas());
       libro.setNombre(obj.getNombre());
       this.repo.editar(libro);
    }

    @Override
    public void eliminar(Integer id) throws ResourceNotFoundException {
        Libro libro = listarPorId(id);
        this.repo.eliminar(libro);
    }
    
}
