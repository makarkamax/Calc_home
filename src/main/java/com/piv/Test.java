package com.piv;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Test {
    Map<String, Object> maps = new HashMap<>();

    {
        Object value = new Object();

        Optional<String> result = maps.entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(result.get());
    }

//if (result.isPresent())
        //System.out.println(result.get());
}

