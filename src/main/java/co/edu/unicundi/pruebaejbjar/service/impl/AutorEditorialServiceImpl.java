/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.dto.AutorEditorialDto;
import co.edu.unicundi.pruebaejbjar.entity.AutorEditorial;
import co.edu.unicundi.pruebaejbjar.repository.IAutorEditorial;
import co.edu.unicundi.pruebaejbjar.service.IAutorEditorialService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.modelmapper.ModelMapper;

/**
 *
 * @author ASUS
 */
@Stateless
public class AutorEditorialServiceImpl implements IAutorEditorialService{
    
    @EJB
    private IAutorEditorial repo;

    @Override
    public void guardar(AutorEditorial obj) {
        //VALIDAR EXISTENCIA DE ID AUTOR
        //VALIDAR EXISTENCIA DE ID EDITORIAL
        //VALIDAR QUE NO EXISTA LLAVE COMPUESTA EN LA BD
        this.repo.guardar(obj);
    }

    //POR MEJORAR
    @Override
    public List<AutorEditorialDto> listarPorAutorId(Integer intgr) {
        
        List<AutorEditorial> listaOriginal = this.repo.listarPorAutorId(intgr);
        List<AutorEditorialDto> listafinal = new ArrayList<>();
        
        for (AutorEditorial lt : listaOriginal) {
            ModelMapper model = new ModelMapper();
            AutorEditorialDto aux = model.map(lt, AutorEditorialDto.class);
            //aux.getAutor().setApellido("");
            listafinal.add(aux);
        }
        return listafinal;
    }
    
}
