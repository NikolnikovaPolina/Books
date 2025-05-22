package ru.amm.nikolnikova.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ArtisticLiteratureTest {

    @Test
    void toString_ShouldReturnFormattedString() {
        ArtisticLiterature book = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        String expectedString = """
                Тип книги: Художественная литература
                Название книги: Война и мир
                Автор: Лев Толстой
                Жанр: Роман
                Содержание: Описание содержания
                Цена: 500 руб
                В наличии 10 шт""";

        assertEquals(expectedString, book.toString());
    }

    @Test
    void equals_ShouldReturnTrue_ForEquivalentObjects() {
        ArtisticLiterature book1 = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        ArtisticLiterature book2 = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        assertEquals(book1, book2);
    }

    @Test
    void equals_ShouldReturnFalse_ForDifferentObjects() {
        ArtisticLiterature book1 = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        ArtisticLiterature book2 = new ArtisticLiterature(
                "Наука о добром",
                "Александр Пушкин",
                5,
                300,
                "Поэзия",
                "Описание другого содержания");

        assertNotEquals(book1, book2);
    }

    @Test
    void hashCode_ShouldReturnSameValue_ForEquivalentObjects() {
        ArtisticLiterature book1 = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        ArtisticLiterature book2 = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    void hashCode_ShouldReturnDifferentValue_ForDifferentObjects() {
        ArtisticLiterature book1 = new ArtisticLiterature(
                "Война и мир",
                "Лев Толстой",
                10,
                500,
                "Роман",
                "Описание содержания");

        ArtisticLiterature book2 = new ArtisticLiterature("Наука о добром",
                "А. С. Пушкин",
                5,
                300,
                "Поэзия",
                "Описание другого содержания");

        assertNotEquals(book1.hashCode(), book2.hashCode());
    }
}
