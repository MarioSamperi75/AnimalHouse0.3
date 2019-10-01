package se.nackademin;

public class Snake extends Animal {

    public Snake(String name, int weight) {
        super(name, weight);
        if (weight<=0)
            throw new IllegalArgumentException("invalid weight");
        this.foodQuantity = 20;
        kindOfFood = KindOfFood.SNAKE.foodname;
    }

    public String getName() {
        return this.name;
    }

}
