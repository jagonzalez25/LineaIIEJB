/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service;

import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
@Local
public interface IUsuarioService {
    
    public String login(String nick, String password)  throws Exception;
}
