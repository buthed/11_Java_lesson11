package com.tematihonov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> object;
    public List <Apple> boxListApple = new ArrayList<>();
    public List <Orange> boxListOrange = new ArrayList<>();
    private Object T;

    public Box(T... object) {
        this.object = new ArrayList<T>(Arrays.asList(object));
    }
}
