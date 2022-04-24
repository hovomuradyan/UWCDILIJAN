package com.company;

class Wine{
    int countOfBottle = 0;
    public void printType() {
        System.out.println("Wine type");
    }
    public void addBottles(int n){
        countOfBottle+=n;
    }
    public void printBottleCount(){
        System.out.println(countOfBottle);
    }
}