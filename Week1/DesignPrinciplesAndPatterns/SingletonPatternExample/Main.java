package Week1.DesignPrinciplesAndPatterns.SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();

        a.log("This is first msg");
        b.log("This is second msg");
        if(a == b){
            System.out.println("It is a singleton pattern");
        }else{
            System.out.println("It is not a singleton pattern");
        }
    }
}
