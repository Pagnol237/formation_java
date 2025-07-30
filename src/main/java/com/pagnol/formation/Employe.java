package com.pagnol.formation;

public class Employe extends Personne{
    private int salaire;

    public Employe (String nom,int age,int salaire){
        super(nom,age);
        this.salaire=salaire;
    }

    @Override
    public String afficheInfo(){
        return super.afficheInfo()+"\nsalaire: "+salaire;
    }
}
