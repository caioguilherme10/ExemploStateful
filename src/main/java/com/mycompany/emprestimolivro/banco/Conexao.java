/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.emprestimolivro.banco;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author ifpb
 */
public class Conexao {
    
    private static final String url = "jdbc:postgresql://localhost:5432/sisRide";
    private static final String usuario = "postgres";
    private static final String senha = "postgres";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, usuario, senha);
    }

}
