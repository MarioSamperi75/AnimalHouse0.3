package se.nackademin;

public class Dog extends Animal implements PersonalDiet {

    public Dog(String name, int weight) {
        super(name, weight);                                        //inkapsling i constructror
        if (weight<=0 )                                              //ex. weight
            throw new IllegalArgumentException("invalid weight");   //exception skapas
        this.createPersonalDiet(weight);                            //metod somm sätter foodQuantity
        kindOfFood = KindOfFood.DOG.foodname;                       //får värdet från Enum
    }//constructror


    public void createPersonalDiet(int weight) {                   //implementerar iterface
        this.foodQuantity = this.weight / 100;
    }//metod createPersonalDiet


    public String getName() {
        return this.name;
    }//metod getName
}//class Dog

