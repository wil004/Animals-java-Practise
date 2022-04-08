import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runZooApp();
    }

    private static void runZooApp() {
        new AnimalKingdom();
        boolean askInformation = true;
        while (askInformation) {
            System.out.println("Welcome to our zoo");
            System.out.println("Choose ur options");
            System.out.println("Typ 0 to see all animals. (Don't forget to press enter!)");
            System.out.println("Typ 1 to see all animals + information");
            System.out.println("Typ 2 to see al animals that walk");
            System.out.println("Typ 3 to see al animals that swim");
            System.out.println("Typ 4 to see all animals that slide");
            System.out.println("Typ 5 to see all animals that lay eggs!");
            System.out.println("Typ 6 to see all animals that give birth!");
            System.out.println("Typ 7 to see all herbivores");
            System.out.println("Typ 8 to see all omnivores");
            System.out.println("Typ 9 to see all carnivores");
            System.out.println("Typ 10 to see all mammals");
            System.out.println("Typ 11 to see all birds");
            System.out.println("Typ 12 to see all fish");
            System.out.println("Typ 13 to see all reptiles");
            System.out.println("typ 14 to choose an animal from the list and see their information!");
            Scanner input = new Scanner(System.in);
            int inputScanner = input.nextInt();

            switch (inputScanner) {
                case 0:
                    AnimalKingdom.getAnimalNames();
                    break;
                case 1:
                    AnimalKingdom.allAnimalInformation();
                    break;
                case 2:
                    AnimalKingdom.animalsThatCanWalk();
                    break;
                case 3:
                    AnimalKingdom.animalsThatCanSwim();
                    break;
                case 4:
                    AnimalKingdom.animalsThatCanSlide();
                    break;
                case 5:
                    AnimalKingdom.animalsThatLayEggs();
                    break;
                case 6:
                    AnimalKingdom.animalsThatGiveBirth();
                    break;
                case 7:
                    AnimalKingdom.herbivores();
                    break;
                case 8:
                    AnimalKingdom.omnivores();
                    break;
                case 9:
                    AnimalKingdom.carnivore();
                    break;
                case 10:
                    AnimalKingdom.mammals();
                    break;
                case 11:
                    AnimalKingdom.birds();
                    break;
                case 12:
                    AnimalKingdom.fish();
                    break;
                case 13:
                    AnimalKingdom.reptiles();
                    break;
                case 14:
                    for (int i = 0; i < AnimalKingdom.getAllAnimals().size(); i++) {
                        System.out.println("typ " + AnimalKingdom.getAllAnimals().get(i).getName() + " voor meer informatie over dit dier!");
                    }
                    String animalInput = input.next();

                    for (int i = 0; i < AnimalKingdom.getAllAnimals().size(); i++) {
                        if (animalInput.equals(AnimalKingdom.getAllAnimals().get(i).getName())) {
                            AnimalKingdom.animalInformation(AnimalKingdom.getAllAnimals().get(i));
                            break;
                        }
                    }
            }
            System.out.println("Want more information about our zoo? typ y for yes and n for no!");
            String moreInfo = input.next();
            if (moreInfo.equalsIgnoreCase("N")) {
                askInformation = false;
                System.out.println("Thank you goodbye may we see you again!");
            }
        }
    }
}
