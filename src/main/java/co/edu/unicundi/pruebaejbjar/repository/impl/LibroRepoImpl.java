/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.repository.impl;

import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.entity.Libro;
import co.edu.unicundi.pruebaejbjar.repository.ILibroRepo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ASUS
 */
@Stateless
public class LibroRepoImpl implements ILibroRepo {
    
    @PersistenceContext(unitName = "conexionPostgresql")
    private EntityManager em;  

    @Override
    public List<Libro> listarTodos() {
        TypedQuery<Libro> query = em.createNamedQuery("Libro.ListarTodos", Libro.class);
        return query.getResultList();
    }

    @Override
    public Libro listarPorId(Integer id) {
         Libro libro = em.find(Libro.class, id);
         return libro;
    }

    @Override
    public void guardar(Libro obj) {
        this.em.persist(obj);
    }

    @Override
    public void editar(Libro obj) {
       this.em.merge(obj);
    }

    @Override
    public void eliminar(Libro obj) {
        this.em.remove(obj);
    }
    
}
