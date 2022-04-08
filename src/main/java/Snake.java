public class Snake extends Animal implements LaysEggs, Slides {
    public Snake(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesLayEggs();
        doesSlide();
    }

    @Override
    public void sleeps() {
        System.out.println("Do snakes sleep?");
    }

    @Override
    public void makesSound() {
        System.out.println("A snake makes hissing sounds");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " whenever he can catch something!");
    }

    @Override
    public void laysEggs() {
        System.out.println("The snake lays a lot of eggs every month");
    }

    @Override
    public void slides() {
        System.out.println("A snake can only slide");
    }
}
