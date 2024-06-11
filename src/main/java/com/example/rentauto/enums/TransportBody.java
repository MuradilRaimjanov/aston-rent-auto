package com.example.rentauto.enums;

public enum TransportBody {

    SEDAN("Седан"),
    HATCHBACK("Хэтчбек"),
    SUV("Внедорожник"),
    COUPE("Купе"),
    CONVERTIBLE("Кабриолет"),
    WAGON("Универсал"),
    PICKUP("Пикап"),
    MINIVAN("Минивэн"),
    CROSSOVER("Кроссовер"),
    VAN("Фургон"),
    ROADSTER("Родстер"),
    LIMOUSINE("Лимузин");

    private final String russianName;

    TransportBody(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }
}
