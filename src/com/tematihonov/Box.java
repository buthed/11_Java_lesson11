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

    public float getWeight() {
        if (object.size() == 0) return 0;
        float weight = 0;
        for (T object: object) weight += object.getWeight();
        return weight;
    }
    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    public void changeBox(Box<? super T> box) {
        box.object.addAll(this.object);
    }
}
