package com.example;

import java.util.Scanner;

public class DemoArraylist2 {
  // Programmet hanterar kontakter (för en mobiltelefon)
  // Lite version med bara spara och visa
  // Man kan spara, visa en kontakts namn och telefonnummer.
  // Det finns en egen klass för kontakter "Contacts" (namn och telefonnummer).
  // Vi har en klass (MobilePhone) som har hand om en ArrayList för "Contacts".
  // "MobilePhone" klassen har hand om all funktionalitet ovan.
  // Vi har en meny i mainklassen (den med static void main)
  // Alternativ i menyn:  Quit, Visa listan med kontakter, Lägg till en ny kontakt.
  // När vi lägger till en kontakt kontrollerar vi om kontakten redan finns.

  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone mobilePhone = new MobilePhone("070-2222222"); // Vi skapar ett objekt av mobilePhone klassen som bara är åtkomlig i denna klassen

  /* Vår main-klass till projektet */
  public static void main(String[] args) {

    boolean quit = false;
    startPhone();
    printActions();
    /* Vår meny i en while-loop ändrat  igen */
    while(!quit) {
      System.out.println("\nVälj: (6 för att visa val)");
      int action = scanner.nextInt();
      scanner.nextLine();

      switch (action) {
        case 0:
          System.out.println("\nStänger ner...");
          quit = true;
          break;

        case 1:
          mobilePhone.printContacts();
          break;

        case 2:
          addNewContact();
          break;

        case 6:
          printActions();
          break;
      }

    }

  }

  private static void addNewContact() {
    System.out.println("Skriv in namnet på din kontakt: ");
    String name = scanner.nextLine();
    System.out.println("Skriv in telefonnummer till din kontakt: ");
    String phone = scanner.nextLine();
    System.out.println("Skriv in email till din kontakt: ");
    String email = scanner.nextLine();
    System.out.println("Skriv in programmeringsspråk för din kontakt: ");
    String language = scanner.nextLine();
    System.out.println("Skriv in databashanaterare för din kontakt: ");
    String database = scanner.nextLine();
    Programmer newContact = new Programmer(name, phone, email, language, database);
    //Programmer newContact = Programmer.createContact(name, phone, email, language, database); // Vi skapar ett objekt direkt där vi kommer åt metoden createContact i Contact klassen
    if(mobilePhone.addNewContact(newContact)) {
      System.out.println("Ny kontakt tillagd: Namn: " + name + ", Telefon: "+ phone + "E-mail: " + email + "Programmeringsspråk " + language);
    } else {
      System.out.println("Kan inte lägga till, " + name + " finns redan.");
    }
  }

  private static void startPhone() {
    System.out.println("Startar telefonen...");
  }

  private static void printActions() {
    System.out.println("\nVälj:\n");
    System.out.println("0  - Stäng av\n" +
            "1  - Visa kontakter\n" +
            "2  - Lägga till en ny kontakt\n" +
            "6  - Visa en lista över alla val.");
  }

}
