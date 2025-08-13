package com.pagnol.formation;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Personne user = new Personne("pagnol",29);
        Employe user2 = new Employe("franck pagnol nounjo",31,200000);
       // System.out.println(user.afficheInfo()+"\nMajeur: "+user.estMajeur());
        System.out.println(user2.afficheInfo());*/
        

        Voiture v1 = new Voiture("Mercedess","GLK",2025,4,true,true);
        Voiture v2 = new Voiture("Huday","Elentra",2025,4,false,true);

        ArrayList<Voiture> voitures = new ArrayList<>();
        voitures.add(v1);
        voitures.add(v2);

        for (Voiture items : voitures) {
            System.out.println(items);
        }
    }
}