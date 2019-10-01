package se.nackademin;

public class Cat extends Animal implements PersonalDiet {

    public Cat(String name, int weight) {
        super(name, weight);
        if (weight<=0)
            throw new IllegalArgumentException("invalid weight");
        this.createPersonalDiet(weight);
        kindOfFood = KindOfFood.CAT.foodname;
    }

    public void createPersonalDiet(int weight) {
        this.foodQuantity = this.weight / 150;
    }

    public String getName() {
        return this.name;
    }
}
