public class Penguin extends Animal implements LaysEggs, Slides, Walks, Swimmable{
    public Penguin(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesSwim();
        doesSlide();
        doesLayEggs();
        doesWalk();
    }

    @Override
    public void sleeps() {
        System.out.println("It's too cold to sleep at the north pole");
    }

    @Override
    public void makesSound() {
        System.out.println("Cute penguin noises");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " anytime of the day!");
    }

    @Override
    public void laysEggs() {
        System.out.println("Lays 2 eggs every year");
    }

    @Override
    public void slides() {
        System.out.println("Can slide to move forward");
    }

    @Override
    public void swim() {
        System.out.println("The penguin can swim 30 kmu");
    }

    @Override
    public void walks() {
        System.out.println("The penguin woggles when he walks");
    }
}
