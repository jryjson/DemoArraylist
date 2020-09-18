package com.example;

public class Contact {
  private String name;
  private String phoneNumber;
  private String email;

  // Konstruktor
  public Contact(String name, String phoneNumber, String email) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  //  Vi använder static för att kunna komma åt metoden utan att skapa ett objekt först i mainklassen
  public static Contact createContact(String name, String phoneNumber, String email) {
    return new Contact(name, phoneNumber, email);
  }
}
