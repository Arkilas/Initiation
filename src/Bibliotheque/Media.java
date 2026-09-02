package Bibliotheque;

public abstract class Media {

    protected String titre;

    public Media(String titre){
        this.titre = titre;
    }

    public abstract void decrire();
    
    public String getTitre(){
        return titre;
    }

}
