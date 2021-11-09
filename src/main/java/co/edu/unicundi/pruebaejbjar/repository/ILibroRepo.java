/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.repository;

import co.edu.unicundi.pruebaejbjar.entity.Autor;
import co.edu.unicundi.pruebaejbjar.entity.Libro;
import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
@Local
public interface ILibroRepo extends ICrud<Libro, Integer>{
    
}
