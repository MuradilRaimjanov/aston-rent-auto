package com.example.rentauto.enums;

public enum Transmission {

    AUTOMATIC("автоматический"),
    MANUAL("механическое") ,
    ROBOT("робот"),
    VARIABLE("вариатор");

    private String name;

    Transmission(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
