/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.entity.Libro;
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
        List<Autor> listaAutor = repo.listarTodos();
        /*for (Autor autor : listaAutor) {
            autor.getLibro().clear();
            autor.setEdad(20);
            autor.getLibro().get(0).setNombre("otro nombre");
            
              Libro libro = new Libro();
              libro.setAutor(autor);
              libro.setDescripcion("des");
              libro.setNoPaginas(20);
              libro.setNombre("nom lim");
              autor.getLibro().add(libro);
        }*/
        //No se debe hacer
      
        return listaAutor;
    }

    @Override
    public Autor listarPorId(Integer id) throws ResourceNotFoundException {
           Autor autor = repo.listarPorId(id);
           if(autor != null)
               return autor;
           else
               throw new ResourceNotFoundException("Autor no encontrado");
    }

    @Override
    public void guardar(Autor obj) {
            //Si se quiere guardar en cascada
            if(obj.getLibro() != null && !obj.getLibro().isEmpty()){
                for (Libro libro : obj.getLibro()) {
                      libro.setAutor(obj);
                }
            }
            this.repo.guardar(obj);
    }

    //QUERY JPQL SQL
    @Override
    public void editar(Autor obj) throws BussinessException, ResourceNotFoundException {
        //No es buena pracita
        //Solucion hacer querys de edicion o quitar la casada
        Autor autor = this.repo.listarPorId(obj.getId());
        autor.setNombre(obj.getNombre());
        autor.setApellido(obj.getApellido());
        autor.setEdad(obj.getEdad());
        this.repo.editar(obj);
    }

    @Override
    public void eliminar(Integer id) throws ResourceNotFoundException {
            Autor autor = listarPorId(id);
            this.repo.eliminar(autor);
    }
    
    
    
}
