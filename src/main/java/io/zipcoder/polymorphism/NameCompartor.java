package io.zipcoder.polymorphism;

import java.util.Comparator;

public class NameCompartor implements Comparator<Pets> {


    public int compare(Pets o1, Pets o2) {

        return o1.getName().compareTo(o2.getName());
    }
}
