package com.narvaez.qa.models;

public class ProfileData {


    private String name;
    private String surname;
    private String dateOfBirth;

    public ProfileData(String name, String surname, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }


}
