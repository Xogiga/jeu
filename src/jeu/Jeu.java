/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import java.math.*;
import java.util.Scanner;
import javax.swing.*;


/**
 *
 * @author p1507423
 */
public class Jeu extends JFrame {
    
    
    public static void main(String[] args) {
        int longu = 100;
        int larg = 2;
        int testuseless;
        
        int plateau[][] = new int[longu][larg];
        testuseless=remplir(plateau, longu);
        
        int pion=0;
        Scanner input = new Scanner(System.in);
        int avc=0;
        affiche(plateau, longu, pion);
        
        do {
            
            //input
            System.out.println("De combien de cases voulez-vous avancer ? (entre 1 et 6)");
            avc = input.nextInt();
            while (avc<1 || avc>6){
                System.out.println("ENTRE 1 ET 6");
                avc = input.nextInt();
            }
            
            //avance de pion
            pion=Avance(pion, avc);
            System.out.println("En route vers la case "+(pion+1)+" !");
            
            
            if (plateau[pion][0]!=0){
                if (plateau[pion][0]>0) 
                    System.out.println("Case chance ! Tu avances de "+plateau[pion][0]+" cases !");
                else
                    System.out.println("Pas de pot ! Tu recules de "+(plateau[pion][0]*-1)+" cases !");
                pion=Avance(pion, plateau[pion][0]);
            }
            
            System.out.println("Arrivee a la case "+(pion+1));
            
            affiche(plateau, longu, pion);
            avc=0;
            
        }while (pion < 99);
        
    }
    
    
    
    public static int remplir(int tab[][], int taille) {
        
        double alead=0;
        int aleai=0;
        int cptest=0;
        
        for (int i=0; i<taille; i++) {
            cptest=i;    
            
            //remplissage du terrain de 1 a 100
            
            tab[i][1]=i+1;
            
            
            //ajout des pieges et bonus
            
            alead=Math.random()*100;
            //10% de chances d'avoir un bonus/malus sur chaque case
            if (alead>80&&alead<100){
                //verification pour ne pas avoir de hors limites
                while (alead>i ){
                    alead=Math.random()*100;
                }
                
                aleai= (int) alead;
                
                //1 chance sur 2 d'avoir un bonus, 1/2 malus
                alead=Math.random();
                if (alead<0.5)
                    tab[i][0]=aleai;
                else
                    tab[i][0]=aleai*-1;
            }
        }
        
        return cptest;
        
    }
    
    public static void affiche(int tab[][], int x, int plac) {
        
        int cpt=0;
        String aff="";
        for (int j=0; j<10; j++) {
            for (int i=0; i<10; i++) {
                aff=" ";
                if (plac==cpt)
                    aff+="•";
                else
                    aff+=" ";
                if (cpt<9)
                    aff+=" "+tab[cpt][1]+" |";
                else
                    aff+=tab[cpt][1]+" |";
                System.out.print(aff);
                cpt++;
            }
            
            
            //affichage des bonus/malus (debug only)
            /*
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
            */
            
            System.out.print("\n");
        }
    }
    
    public static int Avance (int casedep, int lancer) {
        int res = casedep+lancer;
        
        if (res>100)
            return 100;
        else
            return res;
    }
    
    //public static void remplabel (String tab[][], JLabel labels[]) {
    //}
    
}
