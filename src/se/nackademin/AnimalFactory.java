package se.nackademin;

public class AnimalFactory {

    public Animal getAnimal(int num){
        try {
            if      (num==0)
                return new Dog("Sixten",  5000);

            else if (num==1)
                return new Dog("Dogge",  10000);

            else if (num==2)
                return new Cat("Venus",  5000);

            else if (num==3)
                return new Cat("Ove",  3000);

            else if (num==4)
                return new Snake("Hypno",  1000);
        } //Try

        catch (IllegalArgumentException e) {            //genererat i Dog, Cat och Snake constructors.
            System.out.println(e.getMessage());
            System.exit(0);
        }//catch
         return null;
    }//getAnimal

}//AnimalFactory

