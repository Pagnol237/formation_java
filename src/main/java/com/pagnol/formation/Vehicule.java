package com.pagnol.formation;

abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected int  annee;

    public Vehicule(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public abstract void demarer();
}
