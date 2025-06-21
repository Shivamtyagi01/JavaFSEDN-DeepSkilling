package Week1.DesignPrinciplesAndPatterns.SingletonPatternExample;

public class Logger {
    private static Logger instance;

    private Logger(){
        System.out.println("In logger class");
    }

    public static Logger getInstance(){
        if(instance == null)
        {
            instance =  new Logger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}
