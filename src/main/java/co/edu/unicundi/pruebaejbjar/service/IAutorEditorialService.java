/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service;

import co.edu.unicundi.pruebaejbjar.dto.AutorEditorialDto;
import co.edu.unicundi.pruebaejbjar.entity.AutorEditorial;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
@Local
public interface IAutorEditorialService {
    
    public void guardar(AutorEditorial obj);
    
    public List<AutorEditorialDto> listarPorAutorId(Integer id);
    
    
}
