/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Camila
 */
public class País {
    private int id_país;
    private String nome_país;
    private String sigla;

    public País() {
    }

    
    public País(String nome_país, String sigla) {
        this.nome_país = nome_país;
        this.sigla = sigla;
    }

   


    public int getId_país() {
        return id_país;
    }

    public void setId_país(int id_país) {
        this.id_país = id_país;
    }

    public String getNome_país() {
        return nome_país;
    }

    public void setNome_país(String nome_país) {
        this.nome_país = nome_país;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
    
    
}
