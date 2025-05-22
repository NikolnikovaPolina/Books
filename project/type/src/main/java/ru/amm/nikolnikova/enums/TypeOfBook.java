package ru.amm.nikolnikova.enums;

public enum TypeOfBook {
    TYPE(""),
    EDUCATION("Учебная литература"),
    SCIENTIFIC("Научная литература"),
    ARTISTIC("Художественная литература");

    private final String description;

    TypeOfBook(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
