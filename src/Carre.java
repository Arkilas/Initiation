public class Carre extends Forme{
    private double cote;

    public Carre(double cote){
        this.cote=cote;
    }

    @Override
    public double calculerAire(){
        return cote*cote;
    }

    public void setCote(double cote){
        this.cote=cote;
    }
}
