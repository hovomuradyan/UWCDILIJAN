package com.company;

public class WhiteSweet extends White {
    public void printType() {
        System.out.println("Spitak Qagcr");
    }
    int countOfBottle = 0;
    public void addBottles(int n){
        countOfBottle+=n;
    }
    public void printBottleCount(){
        System.out.println(countOfBottle);
    }
}