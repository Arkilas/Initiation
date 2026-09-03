package Bibliotheque;

public class Journal extends Media{

    protected String nom = super.titre;
    protected String date;

    public Journal(String nom, String date){
        super(nom, "");
        this.date = date;
    }

    public Journal(String nom, String date, boolean disponible){
        super(nom, "", disponible);
        this.date = date;
    }

    @Override
    public void decrire() {
        System.out.println("Journal: "+ titre + " - date: " + date + " - Disponibilité: " + disponible);
    } 
    
}
