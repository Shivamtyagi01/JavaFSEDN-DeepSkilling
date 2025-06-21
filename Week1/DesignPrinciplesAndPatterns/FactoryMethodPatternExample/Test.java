package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample;

public class Test {
    public static void main(String[] args) {
        Document a = DocumentFactory.createDocument("word");
        a.create();

        Document b = DocumentFactory.createDocument("pdf");
        b.create();

        Document c = DocumentFactory.createDocument("excel");
        c.create();
    }
}
