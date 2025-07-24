package com.pagnol.formation;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("le debut de la formation et je promet etre le  meilleur");
        //opérateur ternaire : exemple dire si l'utilisateur est majeur

        Scanner scan = new Scanner(System.in);
        System.out.println("veillez saisir votre age s'il vous plais");
        int age = scan.nextInt();
        String majorite = (age >=10)? "vous ête majeur":"vous ête mineur";
        System.out.println(majorite);

        // table de multiplication

        System.out.println("entrez le nombre dont vous souhiater la table de multiplication");
        int nbr = scan.nextInt();

        for(int i=0;i<=10;i++){
            System.out.print(i+"*"+nbr+"= \t"+i*nbr+"\n");
        }

        // nombre aléatoire

        Random random = new Random();
        int nbr_magique = random.nextInt(10)+1;
        int nbr2;
        do{
            System.out.println("saisir le nombre caché entre 1 et 10");
            nbr2 =scan.nextInt();
             String result = (nbr2 == 0)?"zéro n'est pas inclus": (nbr2 == nbr_magique)?"BINGO le nombre etait "+nbr_magique:
                             (nbr2<nbr)?"inférieure":"supérieure";
             System.out.println(result);

        }while(nbr2 != nbr_magique);


    }
}