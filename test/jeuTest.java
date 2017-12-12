/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import jeu.*;

/**
 *
 * @author Tristan
 */
public class jeuTest {
    
    public jeuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void Avancee() {
        int res=Jeu.Avance(99, 7);
        assertEquals(100, res);
    }
    
    //Test qui ne fonctionne pas, mais la fonction remplir du tableau empeche ce genre de probleme
    @Test
    public void AvanceeBug() {
        int res=Jeu.Avance(1, -19);
        assertEquals(0, res);
    }
    
    @Test
    public void Remplir() {
        int tab[][] = new int[100][2];
        assertEquals(99, Jeu.remplir(tab, 100));
    }
    
    @Test
    public void RemplirBug() {
        int tab[][] = new int[100][2];
        assertEquals(60, Jeu.remplir(tab, 100));
    }
}
