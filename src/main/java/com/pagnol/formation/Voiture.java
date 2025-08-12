package com.pagnol.formation;

public class Voiture extends Vehicule  implements Reparable {

    private int nbrPorte;
    private boolean estElectrique;
    private boolean enEtat;
    public Voiture(String marque, String modele, int annee,int nbrPorte, boolean estElectrique,boolean enEtat) {
        super(marque,modele,annee);
        this.nbrPorte = nbrPorte;
        this.estElectrique = estElectrique;
        this.enEtat = enEtat;
    }
    @Override
    public void demarer(){

        if(estElectrique){
            System.out.println("Démarrage a bouton");
        }else{
            System.out.println("démarrage à clé");
        }

    }

    @Override
    public void reparer(){
        if(enEtat){
            System.out.println("Voiture fonctionelle");
        }else{
            System.out.println("voiture en panne");
        }
    }

    public String toString(){
        return "Marque:\t " + marque+"\nAnnée: \t"+annee+"\nNombre de portière: \t"+nbrPorte+"\nÉtat: \t"+enEtat+"\nModèle: \t"+ (estElectrique ? "modèle électrique" : " modèle à essence")+"\n--------------------------------------------------" ;
    }
}
