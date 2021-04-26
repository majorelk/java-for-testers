package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favouriteFood = "Tuna";
        int age = 4;

        Cat simon = new Cat("Simon", "Ham", 4);
        Cat felix = new Cat("Felix", "Tuna", 3);
        Cat spot = new Cat("Spot", "chicken", 5);

        System.out.println(felix.getName());
        System.out.println(felix.getAge());
        System.out.println(felix.getFavouriteFood());

        System.out.println("Spot's age is " + spot.getAge());
        System.out.println("Simons's details are " + simon.getName() + simon.getFavouriteFood() + simon.getAge());
    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido","Bone", 5);

        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", "Tuna", 3);

        felix.makeNoise();
        felix.feed("Tuna");

        felix.groom();
    }
}
