/*Описать иерархию классов для книжного магазина, которая должна содержать:

- интерфейс
- абстрактный класс
- несколько наследников одного класса (или реализаций интерфейса)
- переопределение метода toString
- переопределение методов equals и hashCode
- переопределение публичного метода класса-предка
- использование конструктора с параметрами класса-предка

В коде программы продемонстрировать использование принципов ООП на основе созданной иерархии классов.
*/

package ru.amm.nikolnikova;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.amm.nikolnikova.classes.ArtisticLiterature;
import ru.amm.nikolnikova.classes.Book;
import ru.amm.nikolnikova.classes.EducationLiterature;
import ru.amm.nikolnikova.classes.Library;
import ru.amm.nikolnikova.classes.ScientificLiterature;

public class Bookstore {

    private static final Logger logger = LoggerFactory.getLogger(Bookstore.class);

    public static void main(String[] args) {

        logger.info("Start of work");

        Book artisticLiterature = new ArtisticLiterature(
                "Денискины рассказы",
                "Виктор Юзефович Драгунский",
                7,
                170,
                "Литературный цикл",
                "Первый день, Похититель собак, Рыцари, Слон и радио, Старый мореход");

        Book educationLiterature = new EducationLiterature(
                "Учебное пособие",
                "Гарик Гагикович Петросян",
                12,
                500,
                "Алгебра",
                11);

        Book scientificLiterature = new ScientificLiterature(
                "Познание",
                "Игорь Петрович Мешков",
                3,
                740,
                "Ядерная физика",
                "Начальный");

        Library library = new Library();

        library.addBook(artisticLiterature);
        library.addBook(educationLiterature);
        library.addBook(scientificLiterature);

        library.printBooks();

        logger.info("End of work");
    }
}
