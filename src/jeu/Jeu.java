/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import java.math.*;
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
    
    
    
    public static void remplir(int tab[][], int taille) {
        
        double alead=0;
        int aleai=0;
        
        for (int i=0; i<taille; i++) {
            
            //remplissage du terrain de 1 a 100
            
            tab[i][1]=i+1;
            
            
            //ajout des pieges et bonus
            
            alead=Math.random()*100;
            if (alead>90&&alead<100){
                while (alead>i ){
                    alead=Math.random()*100;
                }
                
                aleai= (int) alead;
                
                alead=Math.random();
                if (alead<0.5)
                    tab[i][0]=aleai;
                else
                    tab[i][0]=aleai*-1;
                
                
                
            }
            
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
            cpt=cpt-10;
                
            for (int i=0; i<10; i++) {
                if (tab[cpt][0]<=9 && tab[cpt][0]>=0)
                    System.out.print("   "+tab[cpt][0]+" |");
                if ((tab[cpt][0]>=10) || (tab[cpt][0]>=-9 && tab[cpt][0]<=-1))
                    System.out.print("  "+tab[cpt][0]+" |");
                if (tab[cpt][0]<=-10)
                    System.out.print(" "+tab[cpt][0]+" |");
                cpt++;
            }
            System.out.print("\n");
        }
    }
    
    public static void remplabel (String tab[][], JLabel labels[]) {
        
    }
    
}
