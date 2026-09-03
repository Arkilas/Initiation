package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    public static void main(String[] args){

        List<Media> listeMedia = new ArrayList<Media>();
        listeMedia.add(new Livre("La peste", "Camus", false));
        listeMedia.add(new Livre("Fondation", "Asimov",  true));
        listeMedia.add(new DVD("Le bon, la brute et le truand", "Sergio Leone", false));
        listeMedia.add(new DVD("L'Apocalypse des annimaux", "Frederic Rossif", true));
        listeMedia.add(new Livre("Les androides revent-ils de moutons electriques ?","Philip K. Dick", true));
        listeMedia.add(new DVD("Blade Runner", "Ridley Scott", false));
        listeMedia.add(new LivreAudio("Le Seigneur des Anneaux", "J.R.R.Tolkien"));
        listeMedia.add(new LivreAudio("Azazel", "Asimov"));
        listeMedia.add(new Journal("le Monde", "15/12/2025"));
        listeMedia.add(new Journal("la Croix", "10/10/2020"));
        listeMedia.add(new Journal("l'equipe", "5/06/2015", false));

        System.out.println("liste des medias");
        for(Media media : listeMedia){
            media.decrire();
        }
        

        Adherent adherent = new Adherent("Serge");

        System.out.println("");
        System.out.println("verification de la liste vide des media empruntes");
        for(Media media : adherent.getMediasEmpruntes()){
            media.decrire();
        }

        System.out.println("");
        System.out.print("l'adherent tente d'emprunter 6 medias");

        adherent.emprunter((listeMedia.get(1)));
        adherent.emprunter((listeMedia.get(2)));
        adherent.emprunter((listeMedia.get(3)));
        adherent.emprunter((listeMedia.get(7)));
        adherent.emprunter((listeMedia.get(8)));
        adherent.emprunter((listeMedia.get(10)));

        System.out.println("");
        System.out.println("affichage de la liste des media empruntes");
        for(Media media : adherent.getMediasEmpruntes()){
            media.decrire();
        }

        System.out.println("");
        System.out.println("verification de la liste des media");

        for(Media media : listeMedia){
            media.decrire();
        }

        System.out.println("");


    }
    
}
