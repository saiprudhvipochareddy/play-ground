package com.javaconcepts.details.LLD.patterns.StructuralPatterns;

public class AdapterPattern {

  public static void main(String[] args) {
    Client client = new Client(new LegacyPrinterAdapter(new LegacyPrinter()));
    client.print();
  }
}

//new printer interface
interface Printer {
  void print();
}

class LegacyPrinterAdapter implements Printer {

  private LegacyPrinter legacyPrinter;

  public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
    this.legacyPrinter = legacyPrinter;
  }

  @Override
  public void print() {
    legacyPrinter.printDocument();
  }
}

//old legacy printer class
class LegacyPrinter {
  public void printDocument() {
    System.out.println("From the legacy document");
  }
}

class Client {
  private Printer printer;

  public Client(Printer printer) {
    this.printer = printer;
  }

  public void print() {
    printer.print();
  }
}
