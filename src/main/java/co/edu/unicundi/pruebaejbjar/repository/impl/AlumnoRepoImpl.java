/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.repository.impl;

import co.edu.unicundi.pruebaejbjar.entity.Alumno;
import co.edu.unicundi.pruebaejbjar.repository.IAlumnoRepo;
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
public class AlumnoRepoImpl implements IAlumnoRepo{
    
    @PersistenceContext(unitName = "conexionPostgresql")
    private EntityManager em;

    @Override
    public List<Alumno> listarTodos() {
        TypedQuery<Alumno> query = em.createNamedQuery("Alumno.ListarTodos", Alumno.class);
        return query.getResultList();
    }

    @Override
    public Alumno listarPorId(Integer id) {
         return em.find(Alumno.class, id);
    }

    @Override
    public void guardar(Alumno obj) {
         this.em.persist(obj);
    }

    @Override
    public void editar(Alumno obj) {
        this.em.merge(obj);
    }

    @Override
    public void eliminar(Alumno obj) {
        this.em.remove(obj);
    }

    
    
}
