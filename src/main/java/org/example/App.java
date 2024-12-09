package org.example;

import java.io.*;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.InputStream;
import java.util.LinkedList;
import java.io.IOException;

/**
 * класс, осуществляющий работу с CSV файлом
 */

public class App
{
    public static LinkedList<Person> readCSV(LinkedList<Person> personsInformation) {

        String csvFilePath = "foreign_names.csv";
        char separator = ';';

        try (InputStream in = CSVReader.class.getClassLoader().getResourceAsStream(csvFilePath);
             com.opencsv.CSVReader reader = in == null ? null :
                     new CSVReaderBuilder(new InputStreamReader(in))
                             .withCSVParser(new CSVParserBuilder().withSeparator(separator).build())
                             .withSkipLines(1).build()) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            int ident=0;
            while ((nextLine = reader.readNext()) != null) {
                Person person = new Person(
                        Integer.parseInt(nextLine[0]),
                        String.valueOf(nextLine[1]),
                        String.valueOf(nextLine[2]),
                        String.valueOf(nextLine[3]),
                        String.valueOf(nextLine[4]),
                        ident,
                        Integer.parseInt(nextLine[5]));
                personsInformation.add(person);
                ident++;
            }
        } catch (IOException | CsvValidationException e) {
            throw new RuntimeException(e);
        }
        return personsInformation;
    }

    public static void main(String[] args)
    {
        LinkedList<Person> personsInformation = new LinkedList<>();
        System.out.println(readCSV(personsInformation));
    }
}
