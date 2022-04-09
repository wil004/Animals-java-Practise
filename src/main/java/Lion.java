public class Lion extends Animal implements GivesBirth, Walks{
    public Lion(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesGiveBirth();
        doesWalk();
    }

    @Override
    public void sleeps() {
        System.out.println("Sleeps 16 hours a day");
    }

    @Override
    public void makesSound() {
        System.out.println("Roars very loud");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " 6 times a day!");
    }

    @Override
    public String givesBirth() {
        return "A lion is a mammal so gives birth from her body.";
    }

    @Override
    public String walks() {
        return "A lion can walk and even run incredibly fast!";
    }
}
