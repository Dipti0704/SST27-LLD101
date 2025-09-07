package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory {
    private final Map<String, TextStyle> cache = new HashMap<>();

    public TextStyle get(String font, int size, boolean bold) {
        String key = key(font, size, bold);
        return cache.computeIfAbsent(key, k -> new TextStyle(font, size, bold));
    }

    private String key(String font, int size, boolean bold) {
        return font + "|" + size + "|" + (bold ? "B" : "N");
    }

    // optional: for quick checks
    public int cacheSize() { return cache.size(); }
}
