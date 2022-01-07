package com.veyselpehlivan.springcloudfunctionexample.model;

import java.util.ArrayList;
import java.util.List;

public class People {
    private static List<People> peopleList = new ArrayList<>();

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void addToList(People people) {
        peopleList.add(people);
    }

    public static List<People> getPeopleList() {
        return peopleList;
    }
}
