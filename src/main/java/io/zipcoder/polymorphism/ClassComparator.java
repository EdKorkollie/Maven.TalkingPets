package io.zipcoder.polymorphism;

import java.util.Comparator;

public class ClassComparator implements Comparator<Pets> {


    public int compare(Pets o1, Pets o2) {

        String classNameOfPet1 = o1.getClass().getSimpleName();
        String classNameOfPet2 = o2.getClass().getSimpleName();

        return classNameOfPet1.compareTo(classNameOfPet2);
    }
}
