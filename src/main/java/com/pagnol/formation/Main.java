package com.pagnol.formation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne user = new Personne("pagnol",29);
        System.out.println(user.afficheInfo()+"\nMajeur: "+user.estMajeur());
    }
}