package ru.amm.nikolnikova.classes;


import ru.amm.nikolnikova.enums.TypeOfBook;
import ru.amm.nikolnikova.interfaces.AdditionalInformationable;

import java.util.Objects;

public final class EducationLiterature extends Book implements AdditionalInformationable {

    private final String objectOfStudy;
    private final int studyClass;
    private final int availabilityDisk;

    public EducationLiterature(String titleOfTheBook, String author, int availability, int price, String objectOfStudy,
                               int studyClass) {
        super(titleOfTheBook, author, availability, price);
        this.objectOfStudy = objectOfStudy;
        this.studyClass = studyClass;
        this.availabilityDisk = (int) (Math.random() * 1) + 1;
        type = TypeOfBook.EDUCATION;
    }

    @Override
    public void hasDisk() {
        System.out.println(availabilityDisk == 1 ? "Продается без диска" : "Продается с диском");
    }

    @Override
    public String flightMaterial(int n) {
        return n == 1 ? "Переплет кожаный" : n == 2 ? "Переплет твердый" : "Переплет мягкий";
    }

    @Override
    public String toString() {
        return getType() +
                "Название книги: " + titleOfTheBook +
                "\nАвтор: " + author +
                "\nПредмет: " + objectOfStudy +
                "\nКласс изучения: " + studyClass +
                "\nЦена: " + price + " руб" +
                "\nВ наличии " + availability + " шт\n" +
                flightMaterial((int) (Math.random() * 3) + 1);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EducationLiterature book)) {
            return false;
        }

        return this.titleOfTheBook.equals(book.titleOfTheBook) && this.author.equals(book.author) &&
                this.objectOfStudy.equals(book.objectOfStudy) && book.studyClass == this.studyClass &&
                book.price == this.price && book.availability == this.availability &&
                book.availabilityDisk == this.availabilityDisk;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, author, price, availability, objectOfStudy, studyClass, availabilityDisk);
    }
}
