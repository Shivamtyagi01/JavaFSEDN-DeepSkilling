package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample;

public class PDFDocument implements Document{
    public void create(){
        System.out.println("A pdf type document is created");
    }
}
