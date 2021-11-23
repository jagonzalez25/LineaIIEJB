/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.repository.impl;

import co.edu.unicundi.pruebaejbjar.entity.AutorEditorial;
import co.edu.unicundi.pruebaejbjar.repository.IAutorEditorial;
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
public class AutorEditorialRepoImpl implements IAutorEditorial {
    
    @PersistenceContext(unitName = "conexionPostgresql")
    private EntityManager em;    
    
    //NO FUNCIONALES
    @Override
    public List<AutorEditorial> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //NO FUNCIONALES
    @Override
    public AutorEditorial listarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<AutorEditorial> listarPorAutorId(Integer id) {
        TypedQuery<AutorEditorial> query = em.createNamedQuery("AutorEditorial.listarPorAutor", AutorEditorial.class);
        query.setParameter("idAutor", id);
        List<AutorEditorial> listaAutorEditorial = query.getResultList();        
        return listaAutorEditorial;
    }

    @Override
    public void guardar(AutorEditorial obj) {
        this.em.persist(obj);
    }

    //NO FUNCIONAL A MENOS QUE ESTEN MODIFICANDO CAMPOS DIFERENTES A LAS LLAVES COMPUESTAS
    @Override
    public void editar(AutorEditorial obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(AutorEditorial obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
