package se.nackademin;

import javax.swing.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * En class som skapar några Animal, sätter dem i en linkedList,
 * och ange information om deras egna personal diet,
 * som svar på specifika frågor.
 */
public class Main {

    public Main() {
        AnimalFactory factory = new AnimalFactory();                        //Skapa djur

        List<Animal> listAnimal = new LinkedList<>();
        for (int num = 0; num < 5; num++)                                   //Sätta dem i en lista
            listAnimal.add(factory.getAnimal(num));

        while (true) {
            String inputName = inputName();                                 //inäsning

            String output = (checkName(inputName,  listAnimal));            //Visa diet
            JOptionPane.showMessageDialog(null, output) ;
        }//while(true)
    } //constructor Main


    public static String inputName () {
        String inputname = JOptionPane.showInputDialog(null, "Namn?");
        if (inputname == null)
            System.exit(0);
        return inputname;
    }


    public static String checkName (String inputName, List<Animal>listAnimal) {
        boolean nameNotFound = true;    //blir false om den inmatna namet motsvarar ett namn i linkedlist
        for (Animal animal : listAnimal) {
            if (inputName.equals(animal.getName())) {
                return (animal.getName() + " ska få " + animal.foodQuantity +
                                " gr av " + animal.kindOfFood);     //Exempel av polimorfism
            }//if
        }//for
            return "Namnet hittades inte";
    }


    public static void main(String[] args) {
        Main m = new Main();
    }//main

}//class Main
