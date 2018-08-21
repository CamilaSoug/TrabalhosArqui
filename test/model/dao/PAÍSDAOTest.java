/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.País;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Camila
 */
public class PAÍSDAOTest {
    
    public PAÍSDAOTest() {
    }

    @Test
    public void inserir() {
        País ps = new País();
        
        PAÍSDAO dao = new PAÍSDAO();
        
        if (dao.save(ps)){
            System.out.println("Salvo com Sucesso");
        } else {
            fail("Erro ao salvar");
        }
    }
    
}
