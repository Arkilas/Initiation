package Bibliotheque;

public class Livre extends Media{

    public Livre(String titre, String auteur){
        super(titre, auteur);
    }

    public Livre(String titre, String auteur, boolean disponible){
        super(titre, auteur, disponible);
    }

    @Override
    public void decrire() {
        System.out.println("Livre: "+ titre + " - Auteur: " + auteur + " - Disponibilité: " + disponible);
    } 
    
}


