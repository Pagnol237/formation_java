package com.pagnol.formation;

public class Personne {

    private String nom;
    private int age;

    public Personne(String nom, int age){
        this.nom = nom;
        this.age=age;
    }

    public String afficheInfo(){
        return "Nom:"+nom+"\nAge:"+age;
    }

    public Boolean estMajeur(){
        return age >= 18;
    }
}
