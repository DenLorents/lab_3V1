package com.company;

import java.util.Scanner;

public class Book {
    String book_name;
    String autor;
    int date;
    String publishing_house;
    int price;
    int condition;
    int delivery_date;

    Scanner scan = new Scanner(System.in);

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getPublishing_house() {
        return publishing_house;
    }

    public void setPublishing_house(String publishing_house) {
        this.publishing_house = publishing_house;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCondition() {
        return condition;
    }
    public void setCondition(int condition) {
        if (condition > 5 || condition < 1)
        {
            int trueCondition = 0;
            System.out.println("Некорректное значение. Качество книги должно быть в диапазоне от 1 до 5");
            System.out.print("Введите состояние книги: ");
            trueCondition = scan.nextInt();
        }
        this.condition = condition;
    }

    public int getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(int delivery_date) {
        this.delivery_date = delivery_date;
    }

    public void setBook_name(java.lang.String nextLine) {
    }

    public void setAutor(java.lang.String nextLine) {
    }

    public void setDate(java.lang.String nextLine) {
    }

    public void setPublishing_house(double nextDouble) {
    }




    
  /*  public String getBook_name() {
        return book_name;
    }
    public void setBook_name(String book_name) {
        this.book_name =book_name;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor= autor;
    }

    public int getDate(){
        return date;
    }
    public void setDate(int date){
        this.date=date;
    }

    public String getPublishing_house() {
        return publishing_house;
    }
    public void setPublishing_house(String publishing_house) {
        this.publishing_house=publishing_house;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition=condition;
    }

    public int getDelivery_date(){
        return delivery_date;
    }
    public void setDelivery_date(int delivery_date){
        this.delivery_date=delivery_date;
    }
    
   */
}
