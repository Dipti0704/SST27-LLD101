package com.example.render;
    
public class Renderer {
    private final TextStyleFactory styleFactory = new TextStyleFactory();

    public int render(String text) {
        int cost = 0;
        for (char c : text.toCharArray()) {
            boolean bold = (c % 7 == 0); // same rule as before
            TextStyle style = styleFactory.get("Inter", 14, bold);
            Glyph g = new Glyph(c, style);
            cost += g.drawCost();
        }
        return cost;
    }
}
