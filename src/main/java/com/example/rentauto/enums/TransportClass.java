package com.example.rentauto.enums;

public enum TransportClass {

    ECONOMY("Эконом"),
    COMFORT("Комфорт"),
    BUSINESS("Бизнес"),
    PREMIUM("Premium"),
    OFFROAD("Внедорожник"),
    MINIVAN("Минивэн"),
    UNIQUE("Уникальные авто");

    private String name;

    TransportClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
