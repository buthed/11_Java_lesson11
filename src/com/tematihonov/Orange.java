package com.tematihonov;

import java.util.ArrayList;

public class Orange extends Fruit {
    public ArrayList<Orange> boxSize;
    private float weight = 0;

    public void addFruit(int qty){
        for (int i = 0; i < qty; i++) {
            boxSize.add(new Orange());
        }
    }

    public Orange() {

    }

    public void getWeight() {
        System.out.println(boxSize.size());
    }
}
