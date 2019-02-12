/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.acursospring.resources;

import com.curso.acursospring.domain.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author RCastro
 */

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar(){
        
        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");
        
        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        
        return lista;
    }
    
}
