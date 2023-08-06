package com.workintech.Enum;

public enum LampType {

    NEON("NEON"),

    BLUE("BLUE");

    private String style;

    LampType(String style) {
        this.style=style;
    }

    public String getName() {
        return style;
    }
}
