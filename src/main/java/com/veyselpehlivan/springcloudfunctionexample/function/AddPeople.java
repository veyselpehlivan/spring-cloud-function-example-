package com.veyselpehlivan.springcloudfunctionexample.function;

import com.veyselpehlivan.springcloudfunctionexample.model.People;

import java.util.function.Function;

public class AddPeople implements Function<People, People> {

    @Override
    public People apply(People people) {
        people.addToList(people);
        return people;
    }
}
