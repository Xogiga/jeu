/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;


/**
 *
 * @author p1507423
 */
public class Jeu {
    
    
    
    public static void main(String[] args) {
        int large = 10;
        int longu = 30;
        
        String terrain[][] = new String[large][longu];
        remplir(terrain, large, longu);
        affiche(terrain, large, longu);
        //yo
        
    }
    
    
    
    public static void remplir(String tab[][], int x, int y) {
        for (int j=0; j<y; j++){
            for (int i=0; i<x; i++){
                tab[i][j]="a";
            }
        }
    }
    
    public static void affiche(String tab[][], int x, int y) {
        for (int j=0; j<y; j++){
            for (int i=0; i<x; i++){
                System.out.print(tab[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}
