package com.xwx;

public class Main {

    public static void main(String[] args) {
        Main.author();
        Main.book();
    }

    public static void author() {
        //TestAuthor
        Author Ivanov = new Author("Иванов", "ivan@nikuda.com");
        System.out.println(Ivanov);

        Ivanov.setEmail("ivan@nikuda.com");
        System.out.println(Ivanov);
        System.out.println("Имя: " + Ivanov.getName());
        System.out.println("Email: " + Ivanov.getEmail());
    }

    public static void book() {
        //TestBook
        Author Ivanov = new Author("Иванов", "ivan@nikuda.com");
        System.out.println(Ivanov);

        Book dummyBook = new Book("Java для чайников", Ivanov, 200, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(300.75);
        dummyBook.setQty(88);
        System.out.println(dummyBook);

        System.out.println("Название: " + dummyBook.getName());
        System.out.println("Цена: " + dummyBook.getPrice());
        System.out.println("Количество: " + dummyBook.getQty());
        System.out.println("Автор: " + dummyBook.getAuthor());

        System.out.println("Имя автора: " + dummyBook.getAuthor().getName());
        System.out.println("Email автора: " + dummyBook.getAuthor().getEmail());

        Book moreDummyBook = new Book("Java для опытных", new Author("Петр Петров", "petrov@nikuda.com"), 19.99, 8);
        System.out.println(moreDummyBook);
    }
}