/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emprestimolivro.controlador;

import com.mycompany.emprestimolivro.model.Livro;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ifpb
 */
@Named
@SessionScoped
public class ServicoEmprestimo implements Serializable{
    
    @EJB
    private EmprestimoLivro emprestimo;
    
    private Livro livro;
    
    public String add(Livro livro) {
        this.emprestimo.addLivro(livro);
        return null;
    }

    public String excluir(Livro livro) {
        this.emprestimo.removeLivro(livro);
        return null;
    }

    public String finalizar() {
        this.emprestimo.finalizar();
        logout();
        return null;
    }
    
    private void logout() {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        HttpSession session = (HttpSession) externalContext.getSession(true);
        session.invalidate();
        
        try {
            externalContext.redirect("index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ServicoEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public List<Livro> todosOsLivros() {
        return null;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    

}
