package com.serenitydojo;

public class Cat {
    private String name;
    private String favouriteFood;
    private int age;

    public static final String CAT_NOISE = "MEOW";

    public Cat(String name, String favouriteFood, int age) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " licks their paws.");
    }

    private void lickPaws() {
        System.out.println(name + " cleans their fur.");
    }
}
