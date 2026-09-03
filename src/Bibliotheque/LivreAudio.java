package Bibliotheque;

public class LivreAudio extends Livre{

    protected final boolean disponible = super.disponible;

    public LivreAudio(String titre, String auteur){
        super(titre, auteur);
        // ici je veux tester l'utilisation d'une variable finale
        // je vais considerer qu'un livre audio est toujours disponible
        // comme si on fournis un ficher audio laissant la possibiliter 
        // de procurer le ficher a d'autres personnes
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
