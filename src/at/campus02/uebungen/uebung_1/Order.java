package at.campus02.uebungen.uebung_1;

import java.lang.reflect.Array;

public class Order {

    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }


    public void addArticle(Article a){
        if(nrArticles >= capacityOrder) {
            increaseArray();
        }
        articles[nrArticles++] = a;
        }

    public void findMostExpensiveArticle(){
//Position (nicht den Index) des
//Artikels zurückliefert, der den höchsten Preis hat. (Zweite Artikel hat Position 2 und liegt auf Index 1)
    }

    public void findMostExpensiveOrderPosition(){
//Position (nicht den
//Index) zurückliefert, welche Anzahl multipliziert mit dem Preis den höchsten Wert hat
    }

    public void  sumOrder(){
// Gesamtsumme der Bestellung berechnet und zurückliefert
    }

    public void calculateTax(){
//Gesamtsumme der Steuer berechnet. Der
//derzeit regierende wohlmeinende Diktator hat ein Herz für alle Menschen und deshalb werden
//Artikel des täglichen Bedarfs, also alle Artikel mit einem Einzelpreis unter 20 Euro, nur mit 5 Prozent
//Steuer anstatt 20 Prozent Steuer versteuert. Liefern Sie die Steuersumme als Rückgabewert.
    }

    public void  sumOrderWithTax(){
//e Gesamtsumme der Bestellung inklusive Steuer berechnet
    }

    private void increaseArray(){
        System.out.printf("capacity increased");
        Article[] newArt = new Article[capacityOrder + 10];

        for(int i = 0; i < nrArticles; ++i){
            newArt[i] = articles[i];
        }
        articles = newArt;
        capacityOrder = capacityOrder + 10;

    }

    public  void removeArticle(int nr){
        if(nr > 0 && nr <= nrArticles){
            for(int i = nr - 1; i < nrArticles; ++i){
                articles[i] = articles[i + 1];
            }
            articles[nrArticles - 1] = null;
            --nrArticles;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + articles +
                '}';
    }

}



