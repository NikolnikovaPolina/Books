package ru.amm.nikolnikova.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ScientificLiteratureTest {

    @Test
    void toString_ShouldReturnFormattedString() {
        ScientificLiterature book = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        String expectedString = """
                Тип книги: Научная литература
                Название книги: Квантовая механика
                Автор: Ричард Фейнман
                Сфера изучения: Физика
                Уровень сложности: Сложный
                Цена: 800 руб
                В наличии 5 шт""";

        assertEquals(expectedString, book.toString());
    }

    @Test
    void equals_ShouldReturnTrue_ForEquivalentObjects() {
        ScientificLiterature book1 = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        ScientificLiterature book2 = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        assertEquals(book1, book2);
    }

    @Test
    void equals_ShouldReturnFalse_ForDifferentObjects() {
        ScientificLiterature book1 = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        ScientificLiterature book2 = new ScientificLiterature(
                "Атомная физика",
                "Давид Грин",
                3,
                600,
                "Физика",
                "Средний"
        );

        assertNotEquals(book1, book2);
    }

    @Test
    void hashCode_ShouldReturnSameValue_ForEquivalentObjects() {
        ScientificLiterature book1 = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        ScientificLiterature book2 = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    void hashCode_ShouldReturnDifferentValue_ForDifferentObjects() {
        ScientificLiterature book1 = new ScientificLiterature(
                "Квантовая механика",
                "Ричард Фейнман",
                5,
                800,
                "Физика",
                "Сложный"
        );

        ScientificLiterature book2 = new ScientificLiterature(
                "Атомная физика",
                "Давид Грин",
                3,
                600,
                "Физика",
                "Средний"
        );

        assertNotEquals(book1.hashCode(), book2.hashCode());
    }
}
