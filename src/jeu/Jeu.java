/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import java.math.*;
import java.util.Scanner;


/**
 *
 * @author p1507423
 */
public class Jeu {
    
    
    public static void main(String[] args) {
        //variable creee afin de faire des tests
        int testuseless=0;
        
        //déclaration de la longueur et la largeur du tableau
        int longu = 100;
        int larg = 2;
        
        //declaration du tableau qui sera le plateau de jeu
        int plateau[][] = new int[longu][larg];
        //remplissage du tableau
        testuseless=remplir(plateau, longu);
        
        //declaration du pion initialise a la case 0, de la variable d'input utilisee plus tard, et de la variable d'avancee
        int pion=0;
        Scanner input = new Scanner(System.in);
        int avc=0;
        
        //1er affichage du tableau
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
            
            //verifie si la case est une case bonus/malus, sinon etape sautee 
            if (plateau[pion][0]!=0){
                if (plateau[pion][0]>0) 
                    System.out.println("Case chance ! Tu avances de "+plateau[pion][0]+" cases !");
                else
                    System.out.println("Pas de pot ! Tu recules de "+(plateau[pion][0]*-1)+" cases !");
                pion=Avance(pion, plateau[pion][0]);
            }
            
            
            System.out.println("Arrivee a la case "+(pion+1));
            
            //reaffichage du plateau
            affiche(plateau, longu, pion);
            //reinitialisation de l'avancee
            avc=0;
            
        }while (pion < 99);
        
    }
    
 
    
    //remplit le tableau
    public static int remplir(int tab[][], int taille) {
        
        //alead : double aleatoire
        double alead=0;
        //aleai : partie entiere de alead
        int aleai=0;
        //cptest : compteur de test initi
        int cptest=0;
        
        for (int i=0; i<taille; i++) {
            
            //remplissage d'une ligne du tableau de 1 a taille
            tab[i][1]=i+1;
            
            
            //ajout des pieges et bonus
            alead=Math.random()*100;
            //20% de chances d'avoir un bonus/malus sur chaque case
            if (alead>80&&alead<100){
                //verification pour ne pas avoir de malus qui fait passer sous 0
                while (alead>i) {
                    alead=Math.random()*100;
                }
                
                //partie entiere de alead dans aleai
                aleai= (int) alead;
                
                //1 chance sur 2 d'avoir un bonus, 1/2 malus
                alead=Math.random();
                if (alead<0.5)
                    tab[i][0]=aleai;
                else
                    tab[i][0]=aleai*-1;
            }
            
            cptest++;    
        }
        
        return cptest;
        
    }
    
    
    //affiche le plateau de jeu
    public static void affiche(int tab[][], int x, int plac) {
        
        //cpt : compteur pour savoir quel chiffre afficher
        int cpt=0;
        String aff="";
        //affichage de 10 lignes
        for (int j=0; j<10; j++) {
            //affichage de 10 colonnes
            for (int i=0; i<10; i++) {
                aff=" ";
                //si le pion est sur la case, on l'affiche
                if (plac==cpt)
                    aff+="•";
                //sinon, on met un espace
                else
                    aff+=" ";
                //si la valeur a afficher est inferieure a 10, on ajoute un espace
                if (cpt<9)
                    aff+=" "+tab[cpt][1]+" |";
                else
                    aff+=tab[cpt][1]+" |";
                System.out.print(aff);
                cpt++;
            }
            
            
            //affichage des bonus/malus sur une ligne supplementaire (debug only)
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
    
    //verifie si on ne dépasse pas 100 lorsque le pion avance
    public static int Avance (int casedep, int lancer) {
        int res = casedep+lancer;
        
        if (res>100)
            return 100;
        else
            return res;
    }
    
}
