package com.example;

import java.util.ArrayList;

public class MobilePhone {
  private String myNumber;
  // Cmd/ctrl klicka i Contact för att se klassen
  private ArrayList<Programmer> myContacts;
  //private ArrayList<Contact> myContacts = new ArrayList<>();

  // Konstruktor
  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<>();
  }

  public boolean addNewContact(Programmer programmer) {
    if(findContact(programmer.getName()) >=0) {
      System.out.println("Kontakten är redan sparad.");
      return false;
    }

    myContacts.add(programmer);
    return true;

  }

  private int findContact(Programmer programmer) {
    return this.myContacts.indexOf(programmer);
  }

  // Overload av metoden findContact dvs man använder samma metod med olika parametrar
  private int findContact(String contactName) {
    for(int i=0; i<this.myContacts.size(); i++) {
      Programmer contact = this.myContacts.get(i);
      if(contact.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }

  public void printContacts() {
    System.out.println("Kontaktlista:");
    for(int i=0; i<this.myContacts.size(); i++) {
      System.out.println((i+1) + "." +
              this.myContacts.get(i).getName() + " -> " +
              this.myContacts.get(i).getPhoneNumber() + " -> " +
              this.myContacts.get(i).getEmail() + " -> " +
              this.myContacts.get(i).getLanguage() + " -> " +
              this.myContacts.get(i).getDatabase());
    }

  }





















}

