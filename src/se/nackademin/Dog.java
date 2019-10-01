package se.nackademin;

public class Dog extends Animal implements PersonalDiet {

    public Dog(String name, int weight) {
        super(name, weight);
        if (weight<=0)
            throw new IllegalArgumentException("invalid weight");
        this.createPersonalDiet(weight);                            // metod somm sätter foodQuantity
        kindOfFood = KindOfFood.DOG.foodname;

    }

    public void createPersonalDiet (int weight) { //jag väljer att använda int. Decimaler av grammer kan inte vara så viktiga.
        this.foodQuantity = this.weight / 100;
    }

    public String getName() {
        return this.name;
    }

}

