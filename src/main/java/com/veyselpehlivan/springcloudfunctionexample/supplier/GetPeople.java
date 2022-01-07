package com.veyselpehlivan.springcloudfunctionexample.supplier;

import com.veyselpehlivan.springcloudfunctionexample.model.People;

import java.util.List;
import java.util.function.Supplier;

public class GetPeople implements Supplier<List<People>> {

    @Override
    public List<People> get() {
        return People.getPeopleList();
    }
}
