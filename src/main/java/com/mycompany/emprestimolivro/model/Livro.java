/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emprestimolivro.model;

import java.util.Objects;

/**
 *
 * @author ifpb
 */
public class Livro {
    
    private String ISBN;
    private String titulo;
    private String edicao;
    private boolean status;

    public Livro(String ISBN, String titulo, String edicao, boolean status) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.edicao = edicao;
        this.status = status;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.ISBN);
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.edicao);
        hash = 29 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.edicao, other.edicao)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Livro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", edicao=" + edicao + ", status=" + status + '}';
    }
    
}
