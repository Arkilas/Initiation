package Bibliotheque;

public class LivreAudio extends Livre{

    protected final boolean disponible = super.disponible;

    public LivreAudio(String titre, String auteur){
        super(titre, auteur);
        super.disponible = true;
    }

    /*public LivreAudio(String titre, String auteur, boolean disponible){
        super(titre, auteur, disponible);
    }*/

    @Override
    public void decrire() {
        System.out.println("LivreAudio: "+ titre + " - Auteur: " + auteur + " - Disponibilité: " + disponible);
    }
    
}
