public class AgeInvalideException extends Exception {

    public AgeInvalideException(String message){
        super(message);
    }

    public static void verifierAge(int age) throws AgeInvalideException {
        if(age < 0){
            throw new AgeInvalideException("Age ne doit pas etre negatif.");
        }
        
    }
    
}


