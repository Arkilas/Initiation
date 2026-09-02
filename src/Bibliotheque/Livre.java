package Bibliotheque;

public class Livre extends Media{

    private String auteur;
    private boolean disponible;


    public Livre(String titre, String auteur){
        super(titre);
        this.auteur = auteur; 
        this.disponible = true;
    }

    @Override
    public void decrire() {
        System.out.println("C'est le livre "+ titre + " de l'auteur " + auteur);
    }

    public String getAuteur(){
        return auteur;
    }

    public boolean getDisponible(){
        return disponible;
    }
    
}

class LivreIndisponibleException extends Exception{
    
    public LivreIndisponibleException(String message){
        super(message);
    }

    public static void verifierDisponibilite(Livre livre) throws LivreIndisponibleException {
        if(!livre.getDisponible()){
            throw new LivreIndisponibleException("Le livre n'est pas disponible.");
        }  
    }
}
