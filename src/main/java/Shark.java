public class Shark extends Animal implements LaysEggs, Swimmable{
    public Shark(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesLayEggs();
        doesSwim();
    }

    @Override
    public void sleeps() {
        System.out.println("Sleeps a few hours in the sea");
    }

    @Override
    public void makesSound() {
        System.out.println("Makes very scary shark noises!");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " 12 times a day!");
    }

    @Override
    public void laysEggs() {
        System.out.println("The shark lays eggs a few times a year");
    }

    @Override
    public void swim() {
        System.out.println("To catch a predator the shark swims very fast");
    }
}
