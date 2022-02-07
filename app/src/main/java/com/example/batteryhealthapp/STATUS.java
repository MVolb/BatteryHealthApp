package com.example.batteryhealthapp;

public enum STATUS {
    GREEN("#2BFF00"),
    YELLOW("#F7FF00"),
    RED("#FF0000"),
    UNKNOWN("#5F5F53");

    public final String color;

    private STATUS(String color) {
        this.color = color;
    }
}
