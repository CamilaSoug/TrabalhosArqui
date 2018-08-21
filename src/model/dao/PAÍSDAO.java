/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.País;


/**
 *
 * @author Camila
 */
public class PAÍSDAO {
    private Connection con = null;

    public PAÍSDAO() {
        con = ConnectionFactory.getConnection();
    }
    public boolean save(País país){
        String sql = "INSERT INTO País(nome_país) values(?);";
        PreparedStatement stmt = null;
        
        try{
        stmt = con.prepareStatement(sql);
        stmt.setString(1, país.getNome_país());
        stmt.executeUpdate();
        return true;
        } catch (SQLException ex){
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }       
}


