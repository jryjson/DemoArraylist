package com.example;

public class Programmer extends Contact {
  private String language;
  private String database;

  public Programmer(String name, String phoneNumber, String email, String language, String database) {
    super(name, phoneNumber, email);
    this.language = language;
    this.database = database;
  }

  public String getLanguage() {
    return language;
  }

  public String getDatabase() {
    return database;
  }

  public static Programmer createContact(String name, String phoneNumber, String email, String language, String database) {
    return new Programmer(name, phoneNumber, email, language, database);
  }
}
