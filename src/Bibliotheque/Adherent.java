package Bibliotheque;

import java.util.ArrayList;
import java.util.List;

public class Adherent{

    private String nom;
    private List<Livre> livresEmpruntes;

    public Adherent(String nom){
        this.nom = nom;
        this.livresEmpruntes = new ArrayList<Livre>();
    }

    public void emprunter(Livre livre){
        try{
            LivreIndisponibleException.verifierDisponibilite(livre);
            livresEmpruntes.add(livre);
        }
        catch(LivreIndisponibleException exception){
            System.out.println("Erreur: " + exception.getMessage());
        }   
    }

}