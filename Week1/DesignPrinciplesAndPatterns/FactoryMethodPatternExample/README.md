# Implementing the Factory Method Pattern

This project demonstrates the factory method pattern in java.
The factory method pattern is a way in which user does not have to create a object for each differnt file rather than that we have a factory class that generates the objects for the user based on the prefernce made by user

## PROJECT STRUCTURE ::
    Document.java //interface of document
    ExcelDocument.java , PDFDocument.java , WordDocument.java  //classes that are implementing the document inteface
    DocumentFactory.java //factory method for creating different objects
    Test.java //to test or create different types of document using single method

## SAMPLE OUTPUT ::
    A word type document is created
    A pdf type document is created
    A excel type document is created