package com.octiq.test.shared;

import java.util.List;
import java.util.stream.Collectors;

public final class Json {
    private Json() { }

    public static String array(List<String> items) {
        return items.stream()
                .map(s -> "\"" + s.replace("\"", "\\\"") + "\"")
                .collect(Collectors.joining(",", "[", "]"));
    }
}
