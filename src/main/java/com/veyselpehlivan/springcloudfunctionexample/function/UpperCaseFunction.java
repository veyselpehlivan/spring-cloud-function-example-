package com.veyselpehlivan.springcloudfunctionexample.function;

import java.util.function.Function;

public class UpperCaseFunction implements Function<String, String> {

    @Override
    public String apply(String name) {
        return name.toUpperCase();
    }

}
