package Week1.DesignPrinciplesAndPatterns.FactoryMethodPatternExample;

public class DocumentFactory {
    public static Document createDocument(String type){
        if(type.equalsIgnoreCase("pdf")){
            return new PDFDocument();
        }
        else if(type.equalsIgnoreCase("word")){
            return new WordDocument();
        }else if(type.equalsIgnoreCase("excel")){
            return new ExcelDocument();
        }
        return null;
    }
}
