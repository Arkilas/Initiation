package Bibliotheque;

public class DVD extends Media{

    public DVD (String titre, String auteur){
        super(titre, auteur);
    }

    public DVD (String titre, String auteur, boolean disponible){
        super(titre, auteur, disponible);
    }

    @Override
    public void decrire() {
        System.out.println("DVD: "+ titre + " - Auteur: " + auteur + " - Disponibilité : " + disponible);;
    }
    
}
