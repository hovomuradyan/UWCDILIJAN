package com.company;

public class White extends Wine{
    public void printType() {
        System.out.println("Spitak Gini");
    }
    int countOfBottle = 0;
    public void addBottles(int n){
        countOfBottle+=n;
    }
    public void printBottleCount(){
        System.out.println(countOfBottle);
    }
}
