package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    public static void main(String[] args){

        List<Media> listeMedia = new ArrayList<Media>();
        listeMedia.add(new Livre("La peste", "Camus"));
        listeMedia.add(new Livre("Fondation", "Asimov"));
        listeMedia.add(new DVD("Le bon, la brute et le truand"));
        listeMedia.add(new DVD("L'Apocalypse des annimaux"));
        listeMedia.add(new Livre("Les androides revent-ils de moutons electriques ?","Philip K. Dick"));
        listeMedia.add(new DVD("Blade Runner"));

        for(Media media : listeMedia){
            media.decrire();
        }
        
    }
    
}
