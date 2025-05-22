package ru.amm.nikolnikova.classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {

    private Library library;
    private Book mockBook;

    @BeforeEach
    void setUp() {
        library = new Library();
        mockBook = mock(Book.class);
    }

    @Test
    public void addBook_ShouldIncreaseBookListSize() {
        when(mockBook.toString()).thenReturn("Mocked Book");

        int initialSize = library.getBooks().size();
        library.addBook(mockBook);

        assertEquals(initialSize + 1, library.getBooks().size());
    }

    @Test
    void printBooks_ShouldPrintBookDetails() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        when(mockBook.toString()).thenReturn("Mocked Book");
        library.addBook(mockBook);

        library.printBooks();

        System.setOut(originalOut);

        String expectedOutput = """
                Mocked Book
                """;
        assertEquals(expectedOutput.trim(), outContent.toString().trim());
    }

    @Test
    void printBooks_ShouldCallHasDiskForEducationLiterature() {

        EducationLiterature mockEduBook = mock(EducationLiterature.class);
        when(mockEduBook.toString()).thenReturn("Mocked Education Book");
        doNothing().when(mockEduBook).hasDisk();

        library.addBook(mockEduBook);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        library.printBooks();

        System.setOut(originalOut);

        verify(mockEduBook).hasDisk();
    }
}
