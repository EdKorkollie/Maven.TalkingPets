package io.zipcoder.polymorphism;

public class Pets implements Comparable<Pets>{
    private String name;

    Pets (String name) {
        this.name = name;
    }
    public String speak() {
        return "Hello";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Pets o) {

        if(name.compareTo(o.getName()) ==0) {
            String pet1className = this.getClass().getSimpleName();
            String pet2className = this.getClass().getSimpleName();
            return pet1className.compareTo(pet2className);
        }
        String passinpetName = o.getName();
        return this.name.compareTo(passinpetName);
    }
}
