import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Exercices{
    public static void main(String[] args) throws Exception{


        exercice1_1();
        exercice1_2();
        exercice1_3();

        exercice2_1();
        exercice2_2();
        exercice2_3();

        exercice3_1();
        exercice3_2();
        exercice3_3();

        exercice4_1();
        exercice4_2();
        exercice4_3();
        exercice4_4();

        exercice5_1();
        exercice5_2();
        exercice5_3();

        exercice6_1();
        exercice6_2();

        //exercice7.1
        System.out.println("0 est pair: " + estPair(0));
        System.out.println("5 est pair: " + estPair(5));
        System.out.println("12 est pair: " + estPair(12));
        System.out.println("25 est pair: " + estPair(25));

        //exercice7.2
        System.out.println("la factorielle de 5 est : "+ factorielle(5));
        System.out.println("la factorielle de 10 est : "+ factorielle(10));
        System.out.println("la factorielle de 0 est : "+ factorielle(0));

        //exercice7.3
        System.out.println("la plus grande des valeurs entre 5 et 13 est: "+maximum(5,13));
        System.out.println("la plus grande des valeurs entre 21 et 11 est: "+maximum(21,10));
        System.out.println("la plus grande des valeurs entre 7.5 et 11.75 est: "+maximum(7.5,11.75));
        System.out.println("la plus grande des valeurs entre 24.56 et 3.14 est: "+maximum(24.56,3.14));

        //exercice8.1
        System.out.println("radar est un palindrome: " + palindrome("radar"));
        System.out.println("serviette est un palindrome: " + palindrome("serviette"));

        //exercice8.2
        System.out.println("la phrase 'c'est un test' comporte "+ compterNombreVoyelles("c'est un test") + " voyelles");

        //exercice8.3
        String[] mots = {"Java", "est", "un", "language", "puissant"};
        System.out.println(constitutionPhrase(mots));

        //exercice9.1
        Rectangle rectangle = new Rectangle(15, 10);
        System.out.println("l'aire du rectangle est de "+rectangle.calculerAire());

        //exercice9.2
        CompteBancaire compteBancaire = new CompteBancaire();
        System.out.println("le compte a un solde de "+compteBancaire.getSolde());
        compteBancaire.deposer(500);
        compteBancaire.deposer(-100);
        System.out.println("le compte a un solde de "+compteBancaire.getSolde());
        compteBancaire.retirer(-100);
        compteBancaire.retirer(1000);
        compteBancaire.retirer(250);

        //exercice10.1 et 10.2
        Forme[] formes = new Forme[4];
        formes[0] = new Carre(10);
        formes[1] = new Cercle(6);
        formes[2] = new Carre(6);
        formes[3] = new Cercle(10);

        for(Forme forme: formes){
            System.out.println("l'aire de la forme est " + forme.calculerAire());
        }

        //exercice 11.1
        Facture facture = new Facture();
        facture.payer();
        Salaire salaire = new Salaire();
        salaire.payer();

        //exercice 11.2
        Voiture voiture = new Voiture();
        voiture.demarrer();
        Moto moto = new Moto();
        moto.demarrer();

        //exercice 12.1
        System.out.println("la division de 1 par 2 donne : "+diviser(1, 2));
        System.out.println("la division de 1 par 0 donne : "+diviser(1, 0));

        //exercice 12.2
        System.out.println("nous allons verifier les ages suivants: 15, 0, -1");
        System.out.println("seul un age incorrect renvoit un message d'exception.");
        try{
            AgeInvalideException.verifierAge(15);
        }
        catch(AgeInvalideException exception){
            System.out.println("Erreur : " + exception.getMessage());
        }
        try{
            AgeInvalideException.verifierAge(0);
        }
        catch(AgeInvalideException exception){
            System.out.println("Erreur : " + exception.getMessage());
        }
        try{
            AgeInvalideException.verifierAge(-1);
        }
        catch(AgeInvalideException exception){
            System.out.println("Erreur : " + exception.getMessage());
        }

        /*System.out.println("Exercice FizzBuzz");
        System.out.println("version directe");
        for (int i = 1 ; i <= 100; i++){
            System.out.println(determinationFizzBuzz(i));
        }
        System.out.println("version tableau");
        String[] resultatsFizzBuzz = new String[100];
        for (int i = 1; i <= 100; i++){
            resultatsFizzBuzz[i-1] = determinationFizzBuzz(i);
        }
        for(String resultat: resultatsFizzBuzz){
            System.out.println(resultat);
        }
        */
    }

    private static void exercice1_1(){
        String prenom = "Jérôme";
        int age = 41;
        double taille = 1.70;
        boolean majeur = true;

        System.out.println("Je suis "+ prenom + ", j'ai " + age + ", je mesure " + taille + " et je suis majeur: "+ majeur);
    }

    private static void exercice1_2(){
        double longueur;
        double largeur;
        double surface;
        longueur = 15.3;
        largeur = 12.2;
        surface = longueur * largeur;
        System.out.println("la surface du rectangle est de "+ surface + " m²");
    }

    private static void exercice1_3(){
        final double PI = 3.14159;
        double rayon;
        double circonference;
        double aire;
        rayon = 5.0;
        circonference = 2 * PI * rayon;
        aire = PI * rayon * rayon;
        System.out.println("la circonference du cercle est de "+ circonference + " et son aire est de " + aire);
    }

    private static void exercice2_1(){
        int nombre;
        nombre = 15;
        boolean pair;
        pair = 0==(nombre%2);
        System.out.println("le nombre est pair: " + pair);         
    }

    private static void exercice2_2(){
        double nombreInitial = 19.99;
        int nombreConverti;
        nombreConverti = (int)nombreInitial;
        System.out.println("le nombre initial est " + nombreInitial + " et le nombre converti est " + nombreConverti);
    }

    private static void exercice2_3(){
        double[][] tableauNote = new double[3][2];
        double moyennePonderee = 0;
        double sommeNotePonderee = 0;
        double coefficientTotal = 0;
        //1ere note et son coefficient
        tableauNote[0][0]=12;
        tableauNote[0][1]=2;
        //2me note et son coefficient
        tableauNote[1][0]=15;
        tableauNote[1][1]=3;
        //3me note et son coefficient
        tableauNote[2][0]=8;
        tableauNote[2][1]=1;
        //calcul de la moyenne ponderee
        for( double[] noteEtCoeff: tableauNote){
            sommeNotePonderee = sommeNotePonderee + noteEtCoeff[0]*noteEtCoeff[1];
            coefficientTotal = coefficientTotal + noteEtCoeff[1];
            /*for(double nombre: noteEtCoeff){
                System.out.println(nombre);
            }*/
        }
        moyennePonderee = sommeNotePonderee / coefficientTotal;
        System.out.println("la moyenne ponderee est de "+ moyennePonderee);
    }

    private static void exercice3_1(){
        int age = 25;
        System.out.println("age "+ age);
        System.out.println((age >= 18)? "Majeur":"Mineur");
    }

    private static void exercice3_2(){
        int note = 15;
        System.out.println("note: " + note);
        if(note>=16){
            System.out.println("Excellent");
        }else if (note >= 12){
            System.out.println("Bien");
        }else if (note >= 10){
            System.out.println("Passable");
        }else{
            System.out.println("Insuffisant");
        }
    }

    private static void exercice3_3(){
        int jour = 5;
        switch(jour){
            case 1 -> System.out.println("Lundi");
            case 2 -> System.out.println("Mardi");
            case 3 -> System.out.println("Mercredi");
            case 4 -> System.out.println("Jeudi");
            case 5 -> System.out.println("Vendredi");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Jour Invalide");
        }
    }

    private static void exercice4_1(){
        for(int i=1; i<11; i++){
           System.out.println("7 x "+i+" = "+7*i); 
        }
    }

    private static void exercice4_2(){
        int i=1;
        int somme = 0;
        while(i<=100){
            somme = somme + i;
            i++;
        }
        System.out.println("la somme des entiers de 1 a 100 est : "+somme);
    }

    private static void exercice4_3(){
        int[] valeurs = {3,8,12,7,4,19,22};
        for(int valeur : valeurs){
            if(0 == valeur%2){
                System.out.println(""+valeur);
            }
        }
    }

    private static void exercice4_4(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void exercice5_1(){
        int [] notes = {12, 8, 17, 5, 14};
        int sommeNotes = 0;
        for(int note : notes){
            sommeNotes = sommeNotes + note; 
        }
        System.out.println("la somme des elements du tableau est " + sommeNotes);
    }

    private static void exercice5_2(){
        int [] notes = {12, 8, 17, 5, 14};
        int maximum = 0;
        for(int note : notes){
            if(note > maximum){
                maximum = note;
            } 
        }
        System.out.println("le plus grand des elements du tableau est " + maximum);
    }

    private static void exercice5_3(){
        int[] notes = {12, 8, 17, 5, 14};
        int[] notesInversees = new int[5];
        for(int i=0; i<5; i++){
            notesInversees[4-i] = notes[i];
        }
        for(int note: notesInversees){
            System.out.println(""+note);;
        }
    }

    private static void exercice6_1(){
        List<String> courses = new LinkedList<String>();
        courses.add("Pain");
        courses.add("Lait");
        courses.add("Oeuf");
        
        //boucle  l'aide d'une iteration propre aux listes
        for(ListIterator<String> it = courses.listIterator(); it.hasNext();){
            System.out.println(it.next());
        }

        //System.out.println(courses.get(1));
        System.out.println("On retire le lait");
        courses.remove(1);
        
        //boucle  l'aide d'une iteration propre aux listes
        for(ListIterator<String> it = courses.listIterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }

    private static void exercice6_2(){
        Map<String, String> capitales = new HashMap<>();
        capitales.put("France", "Paris");
        capitales.put("Espagne", "Madrid");
        capitales.put("Italie", "Rome");

        if(capitales.containsKey("Espagne")){
            System.out.println("la capitale de l'Espagne est "+capitales.get("Espagne"));
        }else{
            System.out.println("la capitale de l'Espagne n'est pas enrengistrée");
        };

        if(capitales.containsKey("Allemagne")){
            System.out.println("la capitale de l'Allemagne est "+capitales.get("Allemagne"));
        }else{
            System.out.println("la capitale de l'Allemagne n'est pas enrengistrée");
        };

    }

    //exercice 7.1
    public static boolean estPair(int n){
        int resteDivisionParDeux;
        resteDivisionParDeux = n%2;
        return((resteDivisionParDeux == 0));
    }

    //exercice 7.2
    public static long factorielle(int n){
        long valeurFactorielle = 1;
        if(n == 0){
            return valeurFactorielle;
        }else{
            for(int i=1; i<=n; i++){
                valeurFactorielle = valeurFactorielle*i;
            }
        }
        return valeurFactorielle;
    }

    //exercice 7.3
    public static int maximum(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public static double maximum(double a, double b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    //exercice 8.1
    public static boolean palindrome(String mot){
        String motInverse;
        motInverse = new StringBuilder(mot).reverse().toString();
        if(motInverse.compareTo(mot)==0) return true;
        else return false;
    }

    //exercice 8.2
    public static int compterNombreVoyelles(String chaineCaractere){
        int nombreVoyelles =0;
        for(int i=0; i<chaineCaractere.length(); i++){
            switch(chaineCaractere.charAt(i)){
                case 'a' -> nombreVoyelles++;
                case 'e' -> nombreVoyelles++;
                case 'i' -> nombreVoyelles++;
                case 'o' -> nombreVoyelles++;
                case 'u' -> nombreVoyelles++;
            }
        }
        return nombreVoyelles;
    }

    //exercice 8.3
    public static String constitutionPhrase(String[] mots){
        //String phraseConstituee = "";
        StringBuilder phraseConstituee = new StringBuilder();
        for(int i=0; i<mots.length ; i++){
            phraseConstituee.append(mots[i]);
            //phraseConstituee = phraseConstituee.concat(mots[i]);
            if(i <= mots.length-1){
                phraseConstituee.append(" ");
                //phraseConstituee = phraseConstituee.concat(" ");
            } 
        }
        return phraseConstituee.toString();
    }

    //exercice 12.1
    public static double diviser(int a, int b){
        double resultat = -1;
        try{
            resultat = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Erreur : "+ e.getMessage());
        }  
        return resultat;
    }


    /*private static String determinationFizzBuzz(int i){
        //test i divisible par 3 ET 5
        if(i%3 == 0 && i%5 == 0){
            return ("FizzBuzz");
        }else
        //test i divisible par 3
        if(i%3 == 0){
            return ("Fizz");
        }else       
        //test i divisible par 5
        if (i%5 == 0) {
        return ("Buzz");
        }else{
                return (""+i);
        }
        
    }*/

}