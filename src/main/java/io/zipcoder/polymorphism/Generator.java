package io.zipcoder.polymorphism;

public class Generator {

    AskZForPets ask = new AskZForPets();
    PetWareHouse petWareHouse = new PetWareHouse();
    PetGenerator petGenerator = new PetGenerator();

    public void runmyProgram() {

        int numofPet = ask.homManyPets();
        for(int i = 0; i < numofPet; i++) {

            String name = ask.nameOfPet();
            String type = ask.typeofPets();
            Pets current = petGenerator.createPet(name, type);
            petWareHouse.addToPetsList(current);
        }
        ask.printListOfPets(petWareHouse.getPetsList());
    }
}
