package com.example.render;

public class Glyph {
    // Smell: style stored per instance → not memory efficient
    private final char ch;
    private final TextStyle style;
    

    public Glyph(char ch, TextStyle style) {
        this.ch = ch; this.style = style;
    }
     public int drawCost() {
        return style.drawCost(); // delegates to TextStyle
    }

    public char getCh() { return ch; }
    public TextStyle getStyle(){
        return style;
    }
}
    
