package ru.amm.nikolnikova.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EducationLiteratureTest {

    @Test
    void toString_ShouldReturnFormattedString() {
        EducationLiterature book = new EducationLiterature(
                "Математика для чайников",
                "Иван Иванов",
                10,
                500,
                "Математика",
                10);

        String result = book.toString();

        assertTrue(result.contains("Название книги: Математика для чайников"));
        assertTrue(result.contains("Автор: Иван Иванов"));
        assertTrue(result.contains("Предмет: Математика"));
        assertTrue(result.contains("Класс изучения: 10"));
        assertTrue(result.contains("Цена: 500 руб"));
        assertTrue(result.contains("В наличии 10 шт"));

        assertEquals("Переплет кожаный", book.flightMaterial(1));
        assertEquals("Переплет твердый", book.flightMaterial(2));
        assertEquals("Переплет мягкий", book.flightMaterial(3));
    }

    @Test
    void equals_ShouldReturnTrue_ForEquivalentObjects() {
        EducationLiterature book1 = new EducationLiterature(
                "Математика для всех",
                "Иван Иванов",
                15,
                600,
                "Математика",
                5
        );

        EducationLiterature book2 = new EducationLiterature(
                "Математика для всех",
                "Иван Иванов",
                15,
                600,
                "Математика",
                5
        );

        assertEquals(book1, book2);
    }

    @Test
    void equals_ShouldReturnFalse_ForDifferentObjects() {
        EducationLiterature book1 = new EducationLiterature(
                "Математика для всех",
                "Иван Иванов",
                15,
                600,
                "Математика",
                5
        );

        EducationLiterature book2 = new EducationLiterature(
                "Русский язык",
                "Петр Петров",
                10,
                400,
                "Русский язык",
                8
        );

        assertNotEquals(book1, book2);
    }

    @Test
    void hashCode_ShouldReturnSameValue_ForEquivalentObjects() {
        EducationLiterature book1 = new EducationLiterature(
                "Математика для всех",
                "Иван Иванов",
                15,
                600,
                "Математика",
                5
        );

        EducationLiterature book2 = new EducationLiterature(
                "Математика для всех",
                "Иван Иванов",
                15,
                600,
                "Математика",
                5
        );

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    void hashCode_ShouldReturnDifferentValue_ForDifferentObjects() {
        EducationLiterature book1 = new EducationLiterature(
                "Математика для всех",
                "Иван Иванов",
                15,
                600,
                "Математика",
                5
        );

        EducationLiterature book2 = new EducationLiterature(
                "Русский язык",
                "Петр Петров",
                10,
                400,
                "Русский язык",
                8
        );

        assertNotEquals(book1.hashCode(), book2.hashCode());
    }
}
