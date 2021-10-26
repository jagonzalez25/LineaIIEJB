/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.repository.impl;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.repository.IAutor;
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
public class AutorRepoImpl implements IAutor{
    
    @PersistenceContext(unitName = "conexionPostgresql")
    private EntityManager em;    

    @Override
    public List<Autor> listarTodos() {
       TypedQuery<Autor> query = em.createNamedQuery("Autor.ListarTodos", Autor.class);
        return query.getResultList();
    }

    @Override
    public Autor listarPorId(Integer id) {
         return em.find(Autor.class, id);
    }

    @Override
    public void guardar(Autor obj) {
             this.em.persist(obj);
    }

    @Override
    public void editar(Autor obj) {
        this.em.merge(obj);
    }

    @Override
    public void eliminar(Autor obj) {
        this.em.remove(obj);
    }
    
}
