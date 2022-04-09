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
    public String laysEggs() {
        return "Lays 2 eggs every year";
    }

    @Override
    public String slides() {
        return "Can slide to move forward";
    }

    @Override
    public String swim() {
        return "The penguin can swim 30 kmu";
    }

    @Override
    public String walks() {
        return "The penguin woggles when he walks";
    }
}
