package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Adherent{

    private String nom;
    private List<Media> mediasEmpruntes;

    public Adherent(String nom){
        this.nom = nom;
        this.mediasEmpruntes = new ArrayList<Media>();
    }

    public void emprunter(Media media){
        try{
            MediaIndisponibleException.verifierDisponibilite(media);
            mediasEmpruntes.add(media);
            media.setDisponible(false);
        }
        catch(MediaIndisponibleException exception){
            System.out.println("Erreur: " + exception.getMessage());
        }   
    }

    public String getNom(){
        return nom;
    } 

    public List<Media> getMediasEmpruntes(){
        return mediasEmpruntes;
    }

}