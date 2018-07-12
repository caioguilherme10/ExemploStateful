/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emprestimolivro.controlador;

import com.mycompany.emprestimolivro.model.Livro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author ifpb
 */
@Stateful
public class EmprestimoLivro {
    
    private List<Livro> livros = new ArrayList<>();
    
    public void addLivro(Livro livro){
        
        if(livro.isStatus()){
            this.livros.add(livro);
        }else{

        }

    }
    
    public void removeLivro(Livro livro){
        livro.setStatus(false);
        this.livros.remove(livro);
    }
    
    @Remove
    public void finalizar() {
        
        
    }
    
    public List<Livro> todosOsLivros() {
        return null;
    }
    
}
