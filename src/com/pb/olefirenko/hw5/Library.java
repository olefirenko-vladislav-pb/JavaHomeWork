package com.pb.olefirenko.hw5;

import java.util.ArrayList;
import java.util.List;


public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Дети капитана Гранта", "Жюль Верн", 1868));
        books.add(new Book("Черный обелиск", "Эрих Мария Ремарк", 1956));
        books.add(new Book("О дивный новый мир", "Олдос Хаксли", 1932));
        books.add(new Book("Воскресение", "Лев Толстой", 1899));
        books.add(new Book("Идиот", "Федор Достоевский", 1868));

        List<Reader> readers = new ArrayList<>();
        readers.add(new Reader("Иванов И.И.", "ПР", "05/09/1997", "+380672224433"));
        readers.add(new Reader("Петров П.П.", "ЭК", "18/06/1991", "+380663335588"));
        readers.add(new Reader("Сидоров С.С.", "КСС", "11/11/1991", "+380689934055"));
        readers.add(new Reader("Александров А.А.", "ФЕА", "21/03/1990", "+380662399000"));

        System.out.printf("В нашей библиотеке - %s: \n", Book.getBooksCount());
        System.out.println("---------------------------");
        for (Book book: books) {
            System.out.println(book.getInfo());
        }

        System.out.println("---------------------------");
        System.out.printf("В нашей библиотеке - %s: \n", Reader.getReadersCount());
        System.out.println("---------------------------");
        for (Reader reader: readers) {
            System.out.println(reader.getInfo());
        }

        System.out.println("---------------------------");
        readers.get(0).takeBook(33);
        System.out.println("***************************");
        readers.get(1).takeBook(books.get(2), books.get(0), books.get(4));
        System.out.println("***************************");
        readers.get(2).returnBook(12);
        System.out.println("***************************");
        readers.get(3).returnBook(books.get(1), books.get(3));
        System.out.println("***************************");

    }
}
