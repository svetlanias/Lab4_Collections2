package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * класс, тестирующий корректность работы класса App
 */
public class AppTest {

    /**
     * тест метода readCSV, осуществляющий чтение из CSV файла и построчно сохраняющий информацию в список
     * @throws IOException если происходит ошибка ввода-вывода при чтении CSV файла
     */
    @Test
    public void readCSVTest() throws IOException
    {
        LinkedList<Person> personsInformation=new LinkedList<>();
        App.readCSV(personsInformation);
        assertEquals(25898,personsInformation.size());
    }
}