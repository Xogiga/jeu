/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import javax.swing.*;


/**
 *
 * @author p1507423
 */
public class Jeu extends JFrame {
    
    
    public static void main(String[] args) {
        int longu = 100;
        int larg = 2;
        
        int plateau[][] = new int[longu][larg];
        remplir(plateau, longu);
        affiche(plateau, longu);
        
        
        
        
    }
    
    
    
    public static void remplir(int tab[][], int x) {
        for (int i=0; i<x; i++) {
            tab[i][1]=i+1;
        }
    }
    
    public static void affiche(int tab[][], int x) {
        int cpt=0;
        for (int j=0; j<10; j++) {
            for (int i=0; i<10; i++) {
                if (cpt<9)
                    System.out.print("   "+tab[cpt][1]+" |");
                else
                    System.out.print("  "+tab[cpt][1]+" |");
                
                cpt++;
            }
            System.out.print("\n");
        }
    }
    
    public static void remplabel (String tab[][], JLabel labels[]) {
        
    }
    
}
