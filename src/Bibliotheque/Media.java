package Bibliotheque;

public abstract class Media {

    protected String titre;
    protected String auteur;
    protected boolean disponible;

    public Media(String titre, String auteur){
        this.titre = titre;
        this.auteur = auteur;
        disponible = true;
    }

    public Media(String titre, String auteur, boolean disponible){
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = disponible;
    }

    public abstract void decrire();
    
    public String getTitre(){
        return titre;
    }

    public String getAuteur(){
        return auteur;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

}

class MediaIndisponibleException extends Exception{
    
    public MediaIndisponibleException(String message){
        super(message);
    }

    public static void verifierDisponibilite(Media media) throws MediaIndisponibleException {
        if(!media.getDisponible()){
            throw new MediaIndisponibleException("Le media n'est pas disponible.");
        }  
    }
}
