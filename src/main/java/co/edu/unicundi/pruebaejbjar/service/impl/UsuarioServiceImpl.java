/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.pruebaejbjar.service.impl;

import co.edu.unicundi.pruebaejbjar.service.IUsuarioService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author ASUS
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService {

    @Override
    public String login(String nick, String password) throws Exception {
        //Ir a base de datos y validar nick y contrasena sean correctos
        //Cifrar contarsena para comprarla en bd
        if(nick.equals("johans") && password.equals("1234")) {
            
            //DWsBiSxoC!TU
            String key = "mi_clave";
            long tiempo =  System.currentTimeMillis();
            
            Map<String, Object> permisos = new HashMap<>();
            
            //Si es por roles se deja un unico ROL
            permisos.put("1", "Administrador");
            //permisos.put("2", "Vendedor");
            //permisos.put("3", "Cliente");
            
            //Si es por permisos
             /*permisos.put("1", "CrearUsuario");
             permisos.put("2", "EditarUsusario");
             permisos.put("3", "Ver Reportes");
             permisos.put("4", "Eliminar Usuario");*/
            
            
            String jwt = Jwts.builder()
                            .signWith(SignatureAlgorithm.HS512, key)
                            .setSubject("johans")
                            .setIssuedAt(new Date(tiempo))
                            .setExpiration(new Date(tiempo + 900000))
                            .claim("permisos", permisos)
                            .compact();
                   
            //Antes de retornar el token lo guardamos en bd en un tabla aparte 
            return jwt;
        } else {
            //401 No autorizado - Crear excepcion personalizada
            throw new Exception("Usuario y/o contrasena incorrecta");
        }    
    }
    
}
