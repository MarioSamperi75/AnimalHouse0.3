package se.nackademin;

import javax.swing.*;
import java.util.*;

/**
 * En class som skapar några Animal, sätter dem i en linkedList,
 * och ange information om deras egna personliga dieter,
 * som svar på specifika användarens frågor.
 */
public class Main {

    public static void main(String[] args) {
        Main m = new Main();
    }//main

    public Main() {
        AnimalFactory factory = new AnimalFactory();                            //STEG1: instansiering av objekt
        List<Animal> listAnimal = new LinkedList<>();
        for (int num = 0; num < 5; num++)                                       //STEG2: ifyllning av listan
            listAnimal.add(factory.getAnimal(num));

        while (true) {
            String inputName = inputName();                                     //STEG3: inäsning

            String output = (checkName(inputName, listAnimal));                 //STEG4: kontroll
            JOptionPane.showMessageDialog(null, output) ;       //STEG5: utskrift
        }//while(true)

    } //constructor Main

                                                                                //STEG3: inäsning
    public static String inputName () {
        String inputname = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");
        if (inputname == null)
            System.exit(0);
        return inputname;
    }//metod inputname

                                                                                //STEG4: kontroll
    public static String checkName (String inputName, List<Animal>listAnimal) {
        for (Animal animal : listAnimal) {
            if (inputName.equals(animal.getName())) {                           //Exempel av polimorfism
                return (animal.getName() + " ska få " + animal.foodQuantity +
                                " gr av " + animal.kindOfFood);
            }//if
        }//for
            return "Namnet hittades inte";
    }//metod checkName

}//class Main
