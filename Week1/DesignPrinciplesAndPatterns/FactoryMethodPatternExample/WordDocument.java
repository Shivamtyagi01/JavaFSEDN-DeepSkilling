package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample;

public class WordDocument implements Document {
    public void create(){
        System.out.println("A word type document is created");
    }
}
