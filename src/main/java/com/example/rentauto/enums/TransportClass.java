package com.example.rentauto.enums;

public enum TransportClass {

    ECONOMY("Эконом"),// 1200
    COMFORT("Комфорт"),// 1500
    BUSINESS("Бизнес"),//
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
