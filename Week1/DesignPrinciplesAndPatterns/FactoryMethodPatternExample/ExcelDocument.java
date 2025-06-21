package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample;

public class ExcelDocument implements Document{
    public void create(){
        System.out.println("A excel type document is created");
    }
}
