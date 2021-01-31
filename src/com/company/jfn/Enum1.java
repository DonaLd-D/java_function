package com.company.jfn;

enum Car1 {
    lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
    private int price;
    Car1(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class Enum1 {
    public static void main(String args[]){
        System.out.println("所有汽车的价格：");
        for (Car1 c : Car1.values())
            System.out.println(c + " 需要 "
                    + c.getPrice() + " 千美元。");
    }
}
