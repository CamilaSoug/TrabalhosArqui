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
public class Cliente {
    private int id_Cliente;
    private String nome;
    private int telefone;
    private int credito;
    private País país;
    private int idade;
    private int limite_credito;

    public Cliente() {
    }

    public Cliente(String nome, int telefone, int credito, País país, int idade, int limite_credito) {
        this.nome = nome;
        this.telefone = telefone;
        this.credito = credito;
        this.país = país;
        this.idade = idade;
        this.limite_credito = limite_credito;
    }
    
    

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public País getPaís() {
        return país;
    }

    public void setPaís(País país) {
        this.país = país;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getLimite_credito() {
        return limite_credito;
    }

    public void setLimite_credito(int limite_credito) {
        this.limite_credito = limite_credito;
    }
    
    
    

   
    
    
}


