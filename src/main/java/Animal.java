import java.util.List;

public abstract class Animal {
    private final String name;
    private final String feature;
    private final String dob;
    private final String species;
    private final String food;
    private final double weight;
    private final double height;
    private boolean laysEggs;
    private boolean givesBirth;
    private boolean swims;
    private boolean walks;
    private boolean slides;

    public Animal(String name, String feature, String dob, String species, String food, double weight, double height) {
        this.name = name;
        this.feature = feature;
        this.dob = dob;
        this.species = species;
        this.food = food;
        this.weight = weight;
        this.height = height;
    }

    protected String getName() {return name;}
    public String getFeature() {return feature;}
    public String getDob() {return dob;}
    public String getSpecies() { return species;}
    public String getFood() {return food;}

    public double getWeight() {return weight;}
    public double getHeight() {return height;}

    protected void doesLayEggs() { this.laysEggs = true; }
    protected void doesGiveBirth() { this.givesBirth = true; }
    protected void doesSwim() { this.swims = true; }
    protected void doesWalk() { this.walks = true; }
    protected void doesSlide() { this.slides = true; }

    public boolean doesAnimalLayEggs() { return laysEggs; }
    public boolean doesAnimalGiveBirth() { return givesBirth; }
    public boolean doesAnimalSwim() { return swims; }
    public boolean doesAnimalWalk() { return walks; }
    public boolean doesAnimalSlide() { return slides; }


    public void eats() {
        System.out.println("Eats " + food);
    }

    public abstract void sleeps();

    public abstract void makesSound();

    public abstract void getsFed();


}
