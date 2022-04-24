package com.company;
public class Main {

    public static void main(String[] args) {
        Wine []wines = new Wine[3];
        wines[0] = new WhiteSweet();
        wines[1] = new WhiteBitter();
        wines[2] = new White();
        wines[0].addBottles(2);
        wines[1].addBottles(-1);
        wines[0].printType();
        for(Wine vino: wines) {
            vino.printBottleCount();
        }
    }
}