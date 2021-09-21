/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Vitor Ravacci - 31817750
 * @author Pedro Joanini - 31852238
 */
public class LabJUnitTest {
    


    LabJUnit lab;
    public LabJUnitTest() {
        lab = new LabJUnit();
    }    
    
    @Test
    public void testValidaData() {
        System.out.println("TestValidaData");
        assertEquals(true, lab.valida_data(1900));
        assertEquals(true, lab.valida_data(2020));
        assertNotEquals(true, lab.valida_data(2021));
        assertNotEquals(true, lab.valida_data(1899));
    }
    @Test
    public void testValidaNota() {
        System.out.println("TestValidaNota");
        assertEquals(true, lab.valida_nota(0));
        assertEquals(true, lab.valida_nota(10));
        assertNotEquals(true, lab.valida_nota(-1));
        assertNotEquals(true, lab.valida_nota(11));
    }
    @Test
    public void testValidaIdade() {
        System.out.println("TestValidaNota");
        assertEquals("Renovação a cada 10 anos", lab.valida_idade(18));
        assertEquals("Renovação a cada 10 anos", lab.valida_idade(49));
        assertEquals("Renovação a cada 5 anos", lab.valida_idade(50));
        assertEquals("Renovação a cada 5 anos", lab.valida_idade(69));
        assertEquals("Renovação a cada 3 anos", lab.valida_idade(70));
        assertEquals("Data Inválida", lab.valida_idade(130));
        assertEquals("Data Inválida", lab.valida_idade(-5));
        assertEquals("Data Inválida", lab.valida_idade(17));
    }
    

}
