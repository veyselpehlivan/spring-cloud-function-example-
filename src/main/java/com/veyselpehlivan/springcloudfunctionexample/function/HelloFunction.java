package com.veyselpehlivan.springcloudfunctionexample.function;

import java.util.function.Function;

public class HelloFunction implements Function<String, String> {

    @Override
    public String apply(String name) {
        return "Hello " + name;
    }

}
