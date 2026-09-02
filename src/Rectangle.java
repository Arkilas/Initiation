public class Rectangle {
    
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur){
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    public double calculerAire(){
        return longueur*largeur;
    }
}
