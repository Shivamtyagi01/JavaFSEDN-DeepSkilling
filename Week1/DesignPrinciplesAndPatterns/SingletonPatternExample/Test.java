package Week1.DesignPrinciplesAndPatterns.SingletonPatternExample;

public class Test {
    public static void main(String[] args) {
         Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();

        if(a == b){
            System.out.println("It is a singleton pattern");
        }else{
            System.out.println("It is not a singleton pattern");
        }
    }
}
