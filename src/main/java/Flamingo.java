public class Flamingo extends Animal implements LaysEggs, Walks{
    public Flamingo(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesLayEggs();
        doesWalk();
    }

    @Override
    public void sleeps() {
        System.out.println("Sleeps standing up");
    }

    @Override
    public void makesSound() {
        System.out.println("Makes flamingo sounds");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " 2 times a day!");
    }

    @Override
    public void laysEggs() {
        System.out.println("A flamingo lays eggs every day!");
    }

    @Override
    public void walks() {
        System.out.println("A flamingo walks funny!");
    }
}
