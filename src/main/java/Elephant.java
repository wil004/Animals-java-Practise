public class Elephant extends Animal implements GivesBirth, Walks{
    public Elephant(String name, String feature, String dob, String species, String food, double weight, double height) {
        super(name, feature, dob, species, food, weight, height);
        doesGiveBirth();
        doesWalk();
    }

    @Override
    public void sleeps() {
        System.out.println("The elephant sleeps only 4 hours a day");
    }

    @Override
    public void makesSound() {
        System.out.println("Makes a sound with his slurf");
    }

    @Override
    public void getsFed() {
        System.out.println(super.getName() + " eats " + super.getFood() + " almost all day long!");
    }

    @Override
    public String givesBirth() {
        return "An elephant doesnt lay eggs but gives birth from her body!";
    }

    @Override
    public String walks() {
       return "An elephant walks with his heavy body!";
    }
}
