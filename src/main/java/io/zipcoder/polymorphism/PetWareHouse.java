package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class PetWareHouse {

    private int numOfPets = 0;
    private ArrayList<Pets> petsList = new ArrayList<Pets>();

    public int getNumOfPets() {
        return numOfPets;
    }

    public void setNumOfPets(int numOfPets) {
        this.numOfPets = numOfPets;
    }

    public ArrayList<Pets> getPetsList() {
        return petsList;
    }

    public void addToPetsList (Pets pet) {
        petsList.add(pet);

    }
}
