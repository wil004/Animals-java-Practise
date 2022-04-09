public class Dolphin extends Animal implements Swimmable, GivesBirth{
    public Dolphin(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesGiveBirth();
        doesSwim();
    }

    @Override
    public void sleeps() {
        System.out.println("Sleeps with one eye open");
    }

    @Override
    public void makesSound() {
        System.out.println("Makes dolphin sounds");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " 5 times a day!");
    }


    public String givesBirth() {
        return "A dolphin is an aquatic mammal";
    }

    @Override
    public String swim() {
        return "A dolphin can swim incredibly fast!";
    }
}
