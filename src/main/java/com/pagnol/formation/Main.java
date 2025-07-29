/*
ce que J'ai appris dans ce chapitre :
- initialisé les tbleau simple et double
- parcourir les tableau avec for et foreach
- utiliser HashMap
- utlisé la methode collection.sort pour ordoner un tableau
- utiliser .split pour convertit des chaine de caractere en tableau;
j'ai mis tous ces élément en pratique dans 3 exercice qui suive
* */
package com.pagnol.formation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // exo 1 : écrire un programme qui calcule la somme de tous les élément du tableau

        int [] tab = {1,2,3,4,5,6,7,8,9,10};
        int somme =0;

        for (int i=0 ; i<= tab.length-1;i++){
            somme+=tab[i];
        }
        System.out.println("la somme de notre tableau est :"+somme);

        // exo 2  : Trouvez le plus grand et le plus petit élément d’un tableau d’entiers.
        Scanner scan = new Scanner(System.in);
        int [] tabs = new int[5];
        for (int i=0; i<=4;i++){
            System.out.println("entrez l'élément "+(i+1)+" du tableau:");
            tabs[i]= scan.nextInt();
        }

        int max = tabs[0];
        for (int i=1; i<tabs.length; i++){
            if (tabs[i]>max){
                max=tabs[i];
            }
        }
        System.out.println("tableau\n===========");
        for(int value : tabs){
            System.out.println("-"+value+"-");
        }
        System.out.println("le plus grans élément du tableau est :"+max);


        // exercice 3 tris du tableau par ordre alphabétique

        Scanner name = new Scanner(System.in);
        ArrayList<String> nameTabs = new ArrayList<>();
        String nom;
        do{
            System.out.println("entrez un nom");
            nom = name.nextLine();
            nameTabs.add(nom);
            Collections.sort(nameTabs);
        }while(!nom.equalsIgnoreCase("stop"));

        for(String items : nameTabs){
            System.out.println("- "+ items);
        }

        //exercice 4: occurence des mots dans une phrase
        Scanner text = new Scanner(System.in);
        System.out.println("saisir une phrase :");
        String texte = text.nextLine();
        String [] tabTexte = texte.split(" ");

        HashMap<String,Integer> occurences = new HashMap<>();

        for(String e: tabTexte){
            if(e.isEmpty()) continue;
            if (occurences.containsKey(e)){
                occurences.put(e,occurences.get(e)+1);
            }else{
                occurences.put(e,1);
            }
        }

        for(String cle : occurences.keySet()){
            System.out.println(cle+":"+occurences.get(cle));
        }

    }
}