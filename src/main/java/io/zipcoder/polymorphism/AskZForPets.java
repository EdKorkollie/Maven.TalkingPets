package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class AskZForPets {

    public int homManyPets() {
        System.out.println("How many pets do you have?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public String typeofPets() {
        System.out.println("What type of pet is this?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public String nameOfPet() {
        System.out.println("What is the name of the pet?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void printListOfPets(ArrayList<Pets> pets) {
        for(Pets pet: pets) {
            System.out.println("Name of pet is: " + pet.getName() + " and it says " + pet.speak());
        }
    }
}
