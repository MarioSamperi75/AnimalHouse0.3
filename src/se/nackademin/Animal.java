package se.nackademin;

public abstract class Animal {

    protected String name;
    protected int weight;
    protected int foodQuantity;
    protected  String kindOfFood;

    public Animal(String name, int weight) {                        //får argument från Factory
        this.name = name;
        this.weight = weight;
    }

    public abstract String getName();
}
