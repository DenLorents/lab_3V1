package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ввод исходных данных о книгах");
        System.out.println("Укажите количество книг: ");
        Scanner in = null;
        int numberBooks = scan.nextInt();
        int k = 0;
        Book[] book = new Book[numberBooks];

        if (numberBooks <= 0) {
            System.out.println("Ошибка,вы ввели отрицательное число");
            return;
        } else {
            for (int i = k; i < numberBooks; i++) {
                System.out.print("Введите название книги: ");
                book[i].setBook_name(scan.nextLine());

                System.out.print("Введите имя автора: ");
                book[i].setAutor(scan.nextLine());

                System.out.print("Введите год издания: ");
                book[i].setDate(scan.nextLine());

                System.out.print("Введите название издательства: ");
                book[i].setPublishing_house(scan.nextDouble());

                System.out.print("Введите цену книги: ");
                book[i].setPrice(scan.nextInt());

                System.out.print("Введите состояние книге (1-5): ");
                book[i].setCondition(scan.nextInt());

                System.out.print("Введите количество месяцев прошедших с даты выдачи книги: ");
                book[i].setDelivery_date(scan.nextInt());

            }
        }
        System.out.println("[1] - Вывод массива на экран");
        System.out.println("[2] - Изменить состояние книг , изданных больше N лет назад");
        System.out.println("[3] - Вывести название всех книг, цена на которые>100 гривен");
        System.out.println("[4] - Вывести название книг всех данного автора");
        System.out.println("[5] - Вывести информацию о книгах которые находяться на руках больше 3 месяцев");
        System.out.println("[6] - Выход из программы");


        System.out.println("\nУкажите № функции: ");
        int way = scan.nextInt();
        if (way > 6 || way < 1) {
            System.out.println("Ошибка,вы указали неверный № функции.");
            return;
        }
        if (way == 1) {
            System.out.println("Выдача массива на экран");
            for (int i = 0; i < numberBooks; i++) {
                System.out.println(book[i].book_name);
                System.out.println(book[i].autor);
                System.out.println(book[i].date);
                System.out.println(book[i].publishing_house);
                System.out.println(book[i].price);
                System.out.println(book[i].condition);
                System.out.println(book[i].delivery_date);
            }

        }
        if (way == 2) {
            System.out.println("Изменить состояние книг , изданных больше N лет назад");
            int editInfoBookCondition = scan.nextInt();
            for (int i = editInfoBookCondition; i < editInfoBookCondition + 1; i++) {
                if (book[i].date < 2018) {
                    System.out.print("Введите состояние книге (1-5): ");
                    book[i].setCondition(scan.nextInt());
                }
            }
        }
        if (way == 3) {
            System.out.println("Вывод на экран название всех книг, цена на которые>100 гривен ");
            for (int i = 0; i < numberBooks; i++) {
                if (book[i].price > 100) {
                    System.out.println(book[i].book_name);
                }
            }
        }

        if (way == 4) {
            System.out.println("Вывод на экран название всех книг данного автора ");
            for (int i = 0; i < numberBooks; i++) {
                if (book[i].autor == book[i].autor) {
                    System.out.println(book[i].book_name);
                }
            }
        }
        if (way == 5) {
            System.out.println("Вывод на экран название всех книг, цена на которые>100 гривен ");
            for (int i = 0; i < numberBooks; i++) {
                if (book[i].delivery_date > 3) {
                    System.out.println(book[i].book_name);
                    System.out.println(book[i].autor);
                    System.out.println(book[i].date);
                    System.out.println(book[i].publishing_house);
                    System.out.println(book[i].price);
                    System.out.println(book[i].condition);
                    System.out.println(book[i].delivery_date);
                }
            }
            if (way == 6) {
                System.out.println("Вы вышли из программы");
                return;
            }
        }
    }
}
