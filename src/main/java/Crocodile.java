
public class Crocodile extends Animal implements Swimmable, Walks, LaysEggs {
    public Crocodile(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesSwim();
        doesWalk();
        doesLayEggs();
    }

    @Override
    public void makesSound() {
        System.out.println("The crocodile makes roar sounds!");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " 3 times a day!");
    }

    @Override
    public void sleeps() {
        System.out.println(super.getName() + " sleeps 12 hours a day");
    }

    public void swim() {
        System.out.println("The crocodile Swims very sneakily");
    }

    @Override
    public void walks() {
        System.out.println("The crocodile can run suprisingly fast!");
    }

    @Override
    public void laysEggs() {
        System.out.println("The crocodile lays eggs");
    }
}
