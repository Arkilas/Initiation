package Bibliotheque;

public class DVD extends Media{

    public DVD(String titre) {
        super(titre);
    }

    @Override
    public void decrire() {
        System.out.println("C'est le DVD " + super.titre);
    }
    
}
