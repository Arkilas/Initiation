public class CompteBancaire {
    
    private double solde;

    public CompteBancaire(){
        this.solde = 0;
    }

    public double getSolde(){
        return solde;
    }

    public void deposer(double montant){
        if (montantEstPositif(montant)) solde += montant;
    }

    public void retirer(double montant){
        if(!montantEstPositif(montant)){
            System.out.println("le montant a retirer doit etre positif");
        }
        else if (montantEstSuperieurSolde(montant)){
            System.out.println("le montant a retirer ne doit pas depasser votre solde actuel");    
        }
        else{
            solde -= montant;
            System.out.println("votre nouveau solde est de "+solde);
        }

    }

    private boolean montantEstPositif(double montant){
        if(montant > 0) return true;
        else return false;
    }

    private boolean montantEstSuperieurSolde(double montant){
        if(montant > solde) return true;
        else return false;
    }
    
}
